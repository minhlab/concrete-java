package edu.jhu.hlt.concrete.ingesters.conll;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.GZIPOutputStream;

import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.Section;
import edu.jhu.hlt.concrete.Sentence;
import edu.jhu.hlt.concrete.Token;
import edu.jhu.hlt.concrete.Tokenization;
import edu.jhu.hlt.concrete.serialization.CommunicationSerializer;
import edu.jhu.hlt.concrete.serialization.CompactCommunicationSerializer;
import edu.jhu.hlt.concrete.serialization.iterators.TarGzArchiveEntryCommunicationIterator;
import edu.jhu.hlt.utilt.AutoCloseableIterator;

/**
 * Accepts {@link Communication}s and dumps to CoNLL-X files. Accepts either a
 * TGZ (many documents) or a single .comm file. If the input is a TGZ, the
 * output must be a directory, into which [commId].conll files will be put.
 *
 * Optionally outputs an aux file which specifies where each conll sentence
 * belongs in the original {@link Communication}, which is necessary for zipping
 * back up conll annotations into a {@link Communication})
 * @see CoNLLX which accepts this aux file
 *
 *
 * NOTE: This description is taken from the Google Syntaxnet (aka parsey mcparseface)
 * documentation: bazel-syntaxnet/syntaxnet/text_formats.cc
 *
 * CoNLL document format reader for dependency annotated corpora.
 * The expected format is described e.g. at http://ilk.uvt.nl/conll/#dataformat
 *
 * Data should adhere to the following rules:
 *   - Data files contain sentences separated by a blank line.
 *   - A sentence consists of one or tokens, each one starting on a new line.
 *   - A token consists of ten fields described in the table below.
 *   - Fields are separated by a single tab character.
 *   - All data files will contains these ten fields, although only the ID
 *     column is required to contain non-dummy (i.e. non-underscore) values.
 * Data files should be UTF-8 encoded (Unicode).
 *
 * Fields:
 * 1  ID:      Token counter, starting at 1 for each new sentence and increasing
 *             by 1 for every new token.
 * 2  FORM:    Word form or punctuation symbol.
 * 3  LEMMA:   Lemma or stem.
 * 4  CPOSTAG: Coarse-grained part-of-speech tag or category.
 * 5  POSTAG:  Fine-grained part-of-speech tag. Note that the same POS tag
 *             cannot appear with multiple coarse-grained POS tags.
 * 6  FEATS:   Unordered set of syntactic and/or morphological features.
 * 7  HEAD:    Head of the current token, which is either a value of ID or '0'.
 * 8  DEPREL:  Dependency relation to the HEAD.
 * 9  PHEAD:   Projective head of current token.
 * 10 PDEPREL: Dependency relation to the PHEAD.
 *
 * This CoNLL reader is compatible with the CoNLL-U format described at
 *   http://universaldependencies.org/format.html
 * Note that this reader skips CoNLL-U multiword tokens and ignores the last two
 * fields of every line, which are PHEAD and PDEPREL in CoNLL format, but are
 * replaced by DEPS and MISC in CoNLL-U.
 *
 * @author travis
 */
public class ConcreteToCoNLLX {

  private static final CommunicationSerializer ser = new CompactCommunicationSerializer();

  private String outputPosToolname = null;  // null means just output words
  public boolean verbose = false;

  private static void dirArg(File f) {
    if (f == null)
      return;
    if (f.isFile())
      throw new IllegalArgumentException("must be a directory: " + f.getPath());
    if (!f.isDirectory())
      f.mkdirs();
  }

  /**
   * Only dumps the words.
   *
   * @param communicationIn can be a .tgz, .tar.gz, or .comm file
   * @param conllOut can be a directory (in which case commId.conll will be used) or a file
   * @param sectionMetaInfoOut may be null, otherwise same rules as conllOut
   */
  public void dump(File communicationIn, File conllOut, File sectionMetaInfoOut) throws Exception {
    if (verbose)
      System.out.println("reading communication from " + communicationIn.getPath());
    String s = communicationIn.getName().toLowerCase();
    if (s.endsWith(".tgz") || s.endsWith(".tar.gz")) {
      // Read multiple communications
      dirArg(conllOut);
      dirArg(sectionMetaInfoOut);
      try (InputStream is = Files.newInputStream(communicationIn.toPath());
          BufferedInputStream bis = new BufferedInputStream(is, 1024 * 8 * 24);
          AutoCloseableIterator<Communication> iter = new TarGzArchiveEntryCommunicationIterator(bis)) {
        while (iter.hasNext()) {
          Communication n = iter.next();
          dump(n, conllOut, sectionMetaInfoOut);
        }
      }
    } else {
      // Read one communication
      Communication c = ser.fromPath(communicationIn.toPath());
      dump(c, conllOut, sectionMetaInfoOut);
    }
  }

  /**
   * Only dumps the words.
   *
   * @param commIn
   * @param conllOut can be a directory (in which case commId.conll will be used) or a file
   * @param sectionMetaInfoOut may be null, otherwise same rules as conllOut
   */
  public void dump(Communication commIn, File conllOut, File sectionMetaInfoOut) throws IOException {
    if (verbose)
      System.out.println("writing conll to " + conllOut.getPath());

    String TAB_NIL = "\t_";

    if (conllOut.isDirectory())
      conllOut = new File(conllOut, commIn.getId() + ".conll");
    if (sectionMetaInfoOut.isDirectory())
      sectionMetaInfoOut = new File(sectionMetaInfoOut, commIn.getId() + ".section-info.aux");

    OutputStream os = new FileOutputStream(conllOut);
    if (conllOut.getName().toLowerCase().endsWith(".gz"))
      os = new GZIPOutputStream(os);
    List<String> metaBySent = new ArrayList<>();
    try (BufferedWriter w = new BufferedWriter(new OutputStreamWriter(os))) {
      for (int sectionIdx = 0; sectionIdx < commIn.getSectionListSize(); sectionIdx++) {
        if (verbose)
          System.out.println("section " + sectionIdx);
        Section section = commIn.getSectionList().get(sectionIdx);
        if (!section.isSetSentenceList() || section.getSentenceListSize() == 0)
          continue;

        String meta = null;
        if (sectionMetaInfoOut != null) {
          // Produce a section-uniq metadata string which each sentence will receive
          String nl = "";
          if (section.isSetNumberList()) {
            for (int i : section.getNumberList()) {
              if (!nl.isEmpty()) nl += " ";
              nl += i;
            }
          } else {
            // If not set, assume that numberLists follow ([0], [1], ..., [n])
            nl = String.valueOf(sectionIdx);
          }
          String k = section.isSetKind() ? section.getKind() : "";
          String l = section.isSetLabel() ? section.getLabel() : "";
          assert k.indexOf('\t') < 0;
          assert l.indexOf('\t') < 0;
          meta = k + "\t" + l + "\t" + nl;
        }

        int sentIdx = 0;
        for (Sentence sentence : section.getSentenceList()) {
          Tokenization toks = sentence.getTokenization();
          List<Token> tokens = toks.getTokenList().getTokenList();

          if (verbose)
            System.out.println("sentence " + sentIdx++);

          if (outputPosToolname != null)
            throw new RuntimeException("implement me");

          for (int i = 0; i < tokens.size(); i++) {
            Token t = tokens.get(i);
            w.write((i+1)               // ID
                + "\t" + t.getText()    // FORM
                + TAB_NIL               // LEMMA
                + TAB_NIL               // CPOSTAG
                + TAB_NIL               // POSTAG
                + TAB_NIL               // FEATS
                + TAB_NIL               // HEAD
                + TAB_NIL               // DEPREL
                + TAB_NIL               // PHEAD
                + TAB_NIL);             // PDEPREL
            w.newLine();
          }
          w.newLine();  // empty line after a sentence

          if (sectionMetaInfoOut != null)
            metaBySent.add(meta);
        }
      }
    }

    if (sectionMetaInfoOut != null) {
      if (verbose)
        System.err.println("writing sentence-section meta information to " + sectionMetaInfoOut.getPath());
      try (BufferedWriter w = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(sectionMetaInfoOut)))) {
        for (String line : metaBySent) {
          w.write(line);
          w.newLine();
        }
      }
    }
  }

  public static void main(String[] args) throws Exception {
    if (args.length != 2 && args.length != 3) {
      System.err.println("please provide:");
      System.err.println("1) an input Communication file");
      System.err.println("2) an output CoNLL-X file or directory (copy name from input, changes suffix to .conll)");
      System.err.println("3) [optional] an output sentence-section meta info file, one line per sentence, each matching <sectionKind> <sectionLabel> <sectionNumberList>");
      System.exit(1);
    }
    ConcreteToCoNLLX c2c = new ConcreteToCoNLLX();
    File in = new File(args[0]);
    File out = new File(args[1]);
    File meta = null;
    if (args.length == 3)
      meta = new File(args[2]);
    c2c.dump(in, out, meta);
  }
}

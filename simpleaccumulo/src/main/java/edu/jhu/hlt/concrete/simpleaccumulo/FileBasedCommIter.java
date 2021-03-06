package edu.jhu.hlt.concrete.simpleaccumulo;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayDeque;
import java.util.List;

import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.serialization.iterators.TarGzArchiveEntryCommunicationIterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Iterates over tgz archives.
 */
public class FileBasedCommIter implements AutoCloseableIterator<Communication> {
  private static final Logger logger = LoggerFactory.getLogger(FileBasedCommIter.class);

  private ArrayDeque<File> inputCommTgzs;
  private TarGzArchiveEntryCommunicationIterator iter;

  public FileBasedCommIter(List<File> inputCommTgzs) {
    this.inputCommTgzs = new ArrayDeque<>();
    this.inputCommTgzs.addAll(inputCommTgzs);
    logger.info("numFiles=" + inputCommTgzs.size() + " first=" + this.inputCommTgzs.peek().getPath());
    advance();
  }
  
  private void advance() {
    File f = inputCommTgzs.pop();
    logger.info("reading " + f.getName());
    try {
      iter = new TarGzArchiveEntryCommunicationIterator(new FileInputStream(f));
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }

  @Override
  public boolean hasNext() {
    return iter != null && iter.hasNext();
  }

  @Override
  public Communication next() {
    Communication c = iter.next();
    if (!iter.hasNext()) {
      iter.close();
      iter = null;
      if (!inputCommTgzs.isEmpty())
        advance();
    }
    return c;
  }

  @Override
  public void close() throws Exception {
    if (iter != null)
      iter.close();
  }
}

/*
 * Copyright 2012-2016 Johns Hopkins University HLTCOE. All rights reserved.
 * See LICENSE in the project root directory.
 */
package edu.jhu.hlt.concrete.ingesters.bolt;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.apache.commons.compress.compressors.gzip.GzipCompressorOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.ParametersDelegate;

import edu.jhu.hlt.acute.archivers.tar.TarArchiver;
import edu.jhu.hlt.concrete.Communication;
import edu.jhu.hlt.concrete.ingesters.base.IngestException;
import edu.jhu.hlt.concrete.ingesters.base.IngesterParameterDelegate;
import edu.jhu.hlt.concrete.serialization.archiver.ArchivableCommunication;
import edu.jhu.hlt.utilt.ex.LoggedUncaughtExceptionHandler;
import edu.jhu.hlt.utilt.io.ExistingNonDirectoryFile;
import edu.jhu.hlt.utilt.io.NotFileException;

/**
 * Class used for bulk conversion of the BOLT corpus.
 *
 * @see #main(String...)
 */
public class BoltIngesterRunner {

  private static final Logger LOGGER = LoggerFactory.getLogger(BoltIngesterRunner.class);

  @ParametersDelegate
  private IngesterParameterDelegate delegate = new IngesterParameterDelegate();

  /**
   *
   */
  public BoltIngesterRunner() {

  }

  /**
   * @param args
   */
  public static void main(String... args) {
    Thread.setDefaultUncaughtExceptionHandler(new LoggedUncaughtExceptionHandler());
    BoltIngesterRunner run = new BoltIngesterRunner();
    JCommander jc = new JCommander(run, args);
    jc.setProgramName(BoltIngesterRunner.class.getSimpleName());
    if (run.delegate.help) {
      jc.usage();
    }

    try {
      Path outpath = Paths.get(run.delegate.outputPath);
      IngesterParameterDelegate.prepare(outpath);
      BoltForumPostIngester ing = new BoltForumPostIngester();
      Path outWithExt = outpath.resolve("bolt.tar.gz");

      if (Files.exists(outWithExt)) {
        if (!run.delegate.overwrite) {
          LOGGER.info("File: {} exists and overwrite disabled. Not running.", outWithExt.toString());
          return;
        } else {
          Files.delete(outWithExt);
        }
      }

      try (OutputStream os = Files.newOutputStream(outWithExt);
          GzipCompressorOutputStream gout = new GzipCompressorOutputStream(os);
          TarArchiver arch = new TarArchiver(gout)) {
        for (Path p : run.delegate.findFilesInPaths()) {
          LOGGER.debug("Running on file: {}", p);
          new ExistingNonDirectoryFile(p);
          try {
            Communication next = ing.fromCharacterBasedFile(p);
            arch.addEntry(new ArchivableCommunication(next));
          } catch (IngestException e) {
            LOGGER.error("Error processing file: " + p, e);
          }
        }
      }
    } catch (NotFileException | IOException e) {
      LOGGER.error("Caught exception processing.", e);
    }
  }
}

package edu.jhu.hlt.concrete.simpleaccumulo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Properties;

import org.apache.accumulo.core.client.security.tokens.PasswordToken;

import edu.jhu.hlt.concrete.Communication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Ingests {@link Communication}s from tgz archives.
 *
 * @author travis
 */
public class SimpleAccumuloIngester {
  private static final Logger logger = LoggerFactory.getLogger(SimpleAccumuloIngester.class);
  
  public static AutoCloseableIterator<Communication> getCommunicationsToIngest(Properties config) {
    String glob = config.getProperty("communications.glob");
    File parent = new File(config.getProperty("communications.root"));
    ArrayList<File> output = new ArrayList<>();
    PathMatcher pm = FileSystems.getDefault().getPathMatcher(glob);
    try {
      Files.walkFileTree(parent.toPath(), new SimpleFileVisitor<Path>() {
        @Override
        public FileVisitResult visitFile(Path path, BasicFileAttributes attrs) throws IOException {
          if (pm.matches(path))
            output.add(path.toFile());
          return FileVisitResult.CONTINUE;
        }
        @Override
        public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
          return FileVisitResult.CONTINUE;
        }
      });
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
    return new FileBasedCommIter(output);
  }

  public static void main(String[] args) throws Exception {
    Properties config = SimpleAccumuloConfig.loadConfig();
    TimeMarker tm = new TimeMarker();
    int stored = 0;
    int storedPrev = 0;
    double interval = 10;
    double rateAvgLocal = 50;
    SimpleAccumuloConfig saConf = SimpleAccumuloConfig.fromConfig(config);    
    logger.info("using " + saConf);
    int nt = Integer.parseInt(config.getProperty("numThreads", "4"));
    logger.info("using numThreads=" + nt);
    try (SimpleAccumuloStore ingester = new SimpleAccumuloStore(saConf, nt);
        AutoCloseableIterator<Communication> comms = getCommunicationsToIngest(config)) {
      ingester.connect(
          config.getProperty("accumulo.user"),
          new PasswordToken(config.getProperty("accumulo.password")));  // TODO better security
      while (comms.hasNext()) {
        Communication c = comms.next();
        ingester.store(c);
        stored++;
        if (tm.enoughTimePassed(interval)) {
          double mins = tm.secondsSinceFirstMark() / 60.0;
          double rate = (stored - storedPrev) / interval;
          double k = 0.9;
          rateAvgLocal = k * rate + (1-k) * rateAvgLocal;
          double rateAvgGlobal = stored / tm.secondsSinceFirstMark();
          storedPrev = stored;
          logger.info(
              "storedComms={}\tmins={}\trateEma={} comm/sec\trateAvg={} comm/sec\tcurRow={}",
              stored, Math.round(mins), Math.round(rateAvgLocal), Math.round(rateAvgGlobal), c.getId());
        }
      }
    }
    logger.info("done, stored=" + stored);
  }
}

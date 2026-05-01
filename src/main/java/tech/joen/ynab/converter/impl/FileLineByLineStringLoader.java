package tech.joen.ynab.converter.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
import tech.joen.ynab.converter.BatchDataLoader;
import tech.joen.yocto.AbstractComponent;
import tech.joen.yocto.core.impl.ApplicationException;

/**
 * Loads data from (supposedly) a CSV file
 */
public class FileLineByLineStringLoader extends AbstractComponent implements BatchDataLoader<String> {

  private Path path;

  @Override
  protected void create() throws ApplicationException {

  }

  @Override
  public Stream<String> streamOfBatches() throws IOException {
    return Files.lines(path);
  }

  @Override
  public void loadFrom(String source) {
    if(path == null) {
      path = Paths.get(source);
    } else {
      throw new IllegalArgumentException("Cannot set source - already set");
    }
  }

}

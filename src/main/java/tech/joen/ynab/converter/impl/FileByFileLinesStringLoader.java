package tech.joen.ynab.converter.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;
import tech.joen.ynab.converter.BatchDataLoader;
import tech.joen.yocto.AbstractComponent;
import tech.joen.yocto.core.impl.ApplicationException;

public class FileByFileLinesStringLoader extends AbstractComponent implements BatchDataLoader<Stream<String>> {

  private Path path;
  
   
  @Override
  public Stream<Stream<String>> streamOfBatches() throws IOException {
    Files.list(path); // TODO
  }
  
  private Stream<String> linesFromFile(Path file) {
    Optional<BatchDataLoader<String>> loader = getContext().newComponent("LineByLineStringLoader");
    // TODO
  }

  @Override
  public void loadFrom(String source) {
    if(path == null) {
      path = Paths.get(source);
    } else {
      throw new IllegalArgumentException("Cannot set source - already set");
    }    
  }

  @Override
  protected void create() throws ApplicationException {
    // TODO Auto-generated method stub
    
  }

}

package tech.joen.ynab.converter.impl;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.IOException;
import java.util.function.Predicate;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class FileLoadersTest {
  
  
  @Test
  void lineByLineLoaderVerifyNoOfLines() throws Exception {
    FileLineByLineStringLoader loader = new FileLineByLineStringLoader();
    loader.loadFrom("src/test/resources/linebylinetest.txt");
    try (Stream<String> stream = loader.streamOfBatches()) {
      assertTrue(stream.count() == 4, "Number of lines in file is correct");
    }
  }
  
  @Test
  void lineByLineLoaderVerifyLineContent() throws Exception {
    FileLineByLineStringLoader loader = new FileLineByLineStringLoader();
    loader.loadFrom("src/test/resources/linebylinetest.txt");
    try (Stream<String> stream = loader.streamOfBatches()) {
      assertTrue(stream.anyMatch(Predicate.isEqual("four lines in")), "Last line exists");
    }
  }
  
  @Test
  void fileByFileCheckNoOfFiles() throws Exception {
    
  }

}

package tech.joen.ynab.converter;

import java.io.IOException;
import java.util.stream.Stream;
import tech.joen.yocto.Component;

/**
 * Loads data from a source (file, url, etc), and outputs the data as String line by line
 */
public interface BatchDataLoader<T> extends Component {

  /**
   * Get the output as a stream
   * @return the stream of lines from the source
   * @throws IOException 
   */
  Stream<T> streamOfBatches() throws IOException;
  
  /**
   * Set the source and open. Can typically only be called once.
   * @param source where to load data from (path, url, etc)
   */
  void loadFrom(String source);
}

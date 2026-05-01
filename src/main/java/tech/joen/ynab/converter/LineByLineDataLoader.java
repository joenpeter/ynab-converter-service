package tech.joen.ynab.converter;

import java.util.stream.Stream;

/**
 * Loads data from a source (file, url, etc), and outputs the data as String line by line
 */
public interface LineByLineDataLoader {

  /**
   * Get the output as a stream
   * @return the stream of lines from the source
   */
  Stream<String> streamOfLine();
  
  /**
   * Set the source and open. Can typically only be called once.
   * @param source where to load data from (path, url, etc)
   */
  void loadFrom(String source);
}

package tech.joen.ynab.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tech.joen.yocto.core.ComponentRegister;
import tech.joen.yocto.core.TestContainer;

public class IntegrationTests {
  

  @BeforeEach
  void setUp() throws Exception {}

  @AfterEach
  void tearDown() throws Exception {}
  
  @Test
  void startupTest() {
    TestContainer container = TestContainer.builder().build();
    container.startup();
    ComponentRegister register = container.getRegister();
    assertNotNull(register, "Check component register exists");
  }
    
  /**
   * Keep for as long as we do not want successful github builds
   */
  @Test
  void alwaysFail() {
    assert(false);
  }
}

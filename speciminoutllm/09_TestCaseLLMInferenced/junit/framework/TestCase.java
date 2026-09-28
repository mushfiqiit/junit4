package junit.framework;

import javax.annotation.Nullable;

@SuppressWarnings("deprecation")
public abstract class TestCase extends Assert implements Test {

  @Nullable private String fName;

  public TestCase() {
    fName = null;
  }
}

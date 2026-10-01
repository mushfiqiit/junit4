package junit.framework;

import javax.annotation.Nullable;

@SuppressWarnings("deprecation")
public abstract class TestCase extends Assert implements Test {

  @Nullable private String fName;

  @Nullable public String getName() {
    return fName;
  }
}

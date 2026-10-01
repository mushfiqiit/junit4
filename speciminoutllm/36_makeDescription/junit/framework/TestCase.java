package junit.framework;

import javax.annotation.Nullable;

@SuppressWarnings("deprecation")
public abstract class TestCase extends Assert implements Test {

  @Nullable
  public String getName() {
    throw new java.lang.Error();
  }
}

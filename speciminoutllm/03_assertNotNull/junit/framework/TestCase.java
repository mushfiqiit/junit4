package junit.framework;

import javax.annotation.Nullable;

@SuppressWarnings("deprecation")
public abstract class TestCase extends Assert implements Test {

  public static void assertNotNull(String message, @Nullable Object object) {
    Assert.assertNotNull(message, object);
  }
}

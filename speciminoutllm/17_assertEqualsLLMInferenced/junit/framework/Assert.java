package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, double expected, double actual, double delta) {
    throw new java.lang.Error();
  }

  public static void assertEquals(double expected, double actual, double delta) {
    assertEquals(null, expected, actual, delta);
  }
}

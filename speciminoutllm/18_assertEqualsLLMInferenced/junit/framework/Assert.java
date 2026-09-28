package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, float expected, float actual, float delta) {
    throw new java.lang.Error();
  }

  public static void assertEquals(float expected, float actual, float delta) {
    assertEquals(null, expected, actual, delta);
  }
}

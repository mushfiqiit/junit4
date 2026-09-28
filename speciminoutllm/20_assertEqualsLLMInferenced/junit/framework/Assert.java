package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, boolean expected, boolean actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(boolean expected, boolean actual) {
    assertEquals(null, expected, actual);
  }
}

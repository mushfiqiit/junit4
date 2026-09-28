package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, long expected, long actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(long expected, long actual) {
    assertEquals(null, expected, actual);
  }
}

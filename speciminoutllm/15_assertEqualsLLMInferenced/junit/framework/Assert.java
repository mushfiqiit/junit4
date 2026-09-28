package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(Object expected, Object actual) {
    assertEquals(null, expected, actual);
  }
}

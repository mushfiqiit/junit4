package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, String expected, String actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(String expected, String actual) {
    assertEquals(null, expected, actual);
  }
}

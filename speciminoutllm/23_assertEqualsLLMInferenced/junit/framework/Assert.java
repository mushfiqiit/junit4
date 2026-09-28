package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, short expected, short actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(short expected, short actual) {
    assertEquals(null, expected, actual);
  }
}

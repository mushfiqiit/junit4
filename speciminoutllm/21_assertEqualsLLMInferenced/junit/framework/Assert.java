package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(@Nullable String message, byte expected, byte actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(byte expected, byte actual) {
    assertEquals(null, expected, actual);
  }
}

package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertSame(@Nullable String message, Object expected, Object actual) {
    if (expected == actual) {
      return;
    }
    failNotSame(message, expected, actual);
  }

  public static void failNotSame(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

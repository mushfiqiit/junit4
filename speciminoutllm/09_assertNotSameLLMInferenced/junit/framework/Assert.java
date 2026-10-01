package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertNotSame(@Nullable String message, Object expected, Object actual) {
    if (expected == actual) {
      failSame(message);
    }
  }

  public static void failSame(@Nullable String message) {
    throw new java.lang.Error();
  }
}

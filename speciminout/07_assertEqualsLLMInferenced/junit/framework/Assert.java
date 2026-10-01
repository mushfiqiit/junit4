package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(
      @Nullable String message, float expected, float actual, float delta) {
    if (Float.compare(expected, actual) == 0) {
      return;
    }
    if (!(Math.abs(expected - actual) <= delta)) {
      failNotEquals(message, Float.valueOf(expected), Float.valueOf(actual));
    }
  }

  public static void failNotEquals(@Nullable String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

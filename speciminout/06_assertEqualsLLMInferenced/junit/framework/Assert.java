package junit.framework;

import javax.annotation.Nullable;

@Deprecated
public class Assert {

  public static void assertEquals(
      @Nullable String message, double expected, double actual, double delta) {
    if (Double.compare(expected, actual) == 0) {
      return;
    }
    if (!(Math.abs(expected - actual) <= delta)) {
      failNotEquals(message, Double.valueOf(expected), Double.valueOf(actual));
    }
  }

  public static void failNotEquals(@Nullable String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

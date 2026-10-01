package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertEquals(
      @Nullable String message, double expected, double actual, double delta) {
    if (doubleIsDifferent(expected, actual, delta)) {
      failNotEquals(message, Double.valueOf(expected), Double.valueOf(actual));
    }
  }

  private static boolean doubleIsDifferent(double d1, double d2, double delta) {
    throw new java.lang.Error();
  }

  private static void failNotEquals(@Nullable String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

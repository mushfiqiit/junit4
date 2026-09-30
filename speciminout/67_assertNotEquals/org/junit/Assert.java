package org.junit;

import javax.annotation.Nullable;

public class Assert {

  private static void failEquals(String message, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(
      @Nullable String message, double unexpected, double actual, double delta) {
    if (!doubleIsDifferent(unexpected, actual, delta)) {
      failEquals(message, Double.valueOf(actual));
    }
  }

  private static boolean doubleIsDifferent(double d1, double d2, double delta) {
    throw new java.lang.Error();
  }
}

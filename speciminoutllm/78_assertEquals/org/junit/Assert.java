package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertEquals(
      @Nullable String message, float expected, float actual, float delta) {
    if (floatIsDifferent(expected, actual, delta)) {
      failNotEquals(message, Float.valueOf(expected), Float.valueOf(actual));
    }
  }

  private static boolean floatIsDifferent(float f1, float f2, float delta) {
    throw new java.lang.Error();
  }

  private static void failNotEquals(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

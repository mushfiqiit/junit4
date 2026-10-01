package org.junit;

import javax.annotation.Nullable;

public class Assert {

  private static void failEquals(String message, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(
      @Nullable String message, float unexpected, float actual, float delta) {
    if (!floatIsDifferent(unexpected, actual, delta)) {
      failEquals(message, Float.valueOf(actual));
    }
  }

  private static boolean floatIsDifferent(float f1, float f2, float delta) {
    throw new java.lang.Error();
  }
}

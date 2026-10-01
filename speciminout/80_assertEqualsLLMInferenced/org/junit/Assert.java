package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertEquals(@Nullable String message, long expected, long actual) {
    if (expected != actual) {
      failNotEquals(message, Long.valueOf(expected), Long.valueOf(actual));
    }
  }

  private static void failNotEquals(@Nullable String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

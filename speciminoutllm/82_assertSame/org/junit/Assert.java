package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertSame(@Nullable String message, Object expected, Object actual) {
    if (expected == actual) {
      return;
    }
    failNotSame(message, expected, actual);
  }

  private static void failNotSame(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

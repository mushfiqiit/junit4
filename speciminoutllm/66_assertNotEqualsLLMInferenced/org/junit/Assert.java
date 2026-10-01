package org.junit;

import javax.annotation.Nullable;

public class Assert {

  private static void failEquals(@Nullable String message, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(@Nullable String message, long unexpected, long actual) {
    if (unexpected == actual) {
      failEquals(message, Long.valueOf(actual));
    }
  }
}

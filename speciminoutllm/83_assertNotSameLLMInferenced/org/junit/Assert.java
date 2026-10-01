package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNotSame(@Nullable String message, Object unexpected, Object actual) {
    if (unexpected == actual) {
      failSame(message);
    }
  }

  private static void failSame(@Nullable String message) {
    throw new java.lang.Error();
  }
}

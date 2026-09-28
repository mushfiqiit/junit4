package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertEquals(long expected, long actual) {
    assertEquals(null, expected, actual);
  }

  public static void assertEquals(@Nullable String message, long expected, long actual) {
    throw new java.lang.Error();
  }
}

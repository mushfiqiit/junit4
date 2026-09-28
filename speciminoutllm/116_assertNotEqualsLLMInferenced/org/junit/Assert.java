package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNotEquals(@Nullable String message, long unexpected, long actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(long unexpected, long actual) {
    assertNotEquals(null, unexpected, actual);
  }
}

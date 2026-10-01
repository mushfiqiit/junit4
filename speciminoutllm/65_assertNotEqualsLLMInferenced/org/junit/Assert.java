package org.junit;

import javax.annotation.Nullable;

public class Assert {

  private static boolean equalsRegardingNull(Object expected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(@Nullable String message, Object unexpected, Object actual) {
    if (equalsRegardingNull(unexpected, actual)) {
      failEquals(message, actual);
    }
  }

  private static void failEquals(@Nullable String message, Object actual) {
    throw new java.lang.Error();
  }
}

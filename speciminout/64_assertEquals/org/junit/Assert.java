package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertEquals(@Nullable String message, Object expected, Object actual) {
    if (equalsRegardingNull(expected, actual)) {
      return;
    }
    if (expected instanceof String && actual instanceof String) {
      String cleanMessage = message == null ? "" : message;
      throw new ComparisonFailure(cleanMessage, (String) expected, (String) actual);
    } else {
      failNotEquals(message, expected, actual);
    }
  }

  private static boolean equalsRegardingNull(Object expected, Object actual) {
    throw new java.lang.Error();
  }

  private static void failNotEquals(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }
}

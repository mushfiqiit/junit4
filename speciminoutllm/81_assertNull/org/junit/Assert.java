package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNull(@Nullable String message, Object object) {
    if (object == null) {
      return;
    }
    failNotNull(message, object);
  }

  private static void failNotNull(String message, Object actual) {
    throw new java.lang.Error();
  }
}

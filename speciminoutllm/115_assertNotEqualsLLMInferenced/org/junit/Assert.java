package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNotEquals(@Nullable String message, Object unexpected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(Object unexpected, Object actual) {
    assertNotEquals(null, unexpected, actual);
  }
}

package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNotSame(@Nullable String message, Object unexpected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotSame(Object unexpected, Object actual) {
    assertNotSame(null, unexpected, actual);
  }
}

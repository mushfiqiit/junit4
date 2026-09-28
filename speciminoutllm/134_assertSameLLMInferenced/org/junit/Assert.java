package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertSame(@Nullable String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertSame(Object expected, Object actual) {
    assertSame(null, expected, actual);
  }
}

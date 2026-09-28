package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertFalse(@Nullable String message, boolean condition) {
    throw new java.lang.Error();
  }

  public static void assertFalse(boolean condition) {
    assertFalse(null, condition);
  }
}

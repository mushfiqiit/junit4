package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNull(@Nullable String message, Object object) {
    throw new java.lang.Error();
  }

  public static void assertNull(Object object) {
    assertNull(null, object);
  }
}

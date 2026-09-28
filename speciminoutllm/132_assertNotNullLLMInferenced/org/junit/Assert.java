package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNotNull(@Nullable String message, Object object) {
    throw new java.lang.Error();
  }

  public static void assertNotNull(Object object) {
    assertNotNull(null, object);
  }
}

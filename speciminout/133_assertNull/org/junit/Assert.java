package org.junit;

public class Assert {

  public static void assertNull(String message, Object object) {
    throw new java.lang.Error();
  }

  public static void assertNull(Object object) {
    assertNull(null, object);
  }
}

package org.junit;

public class Assert {

  public static void assertNotNull(String message, Object object) {
    throw new java.lang.Error();
  }

  public static void assertNotNull(Object object) {
    assertNotNull(null, object);
  }
}

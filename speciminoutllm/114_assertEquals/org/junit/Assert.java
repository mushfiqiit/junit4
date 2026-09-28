package org.junit;

public class Assert {

  public static void assertEquals(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertEquals(Object expected, Object actual) {
    assertEquals(null, expected, actual);
  }
}

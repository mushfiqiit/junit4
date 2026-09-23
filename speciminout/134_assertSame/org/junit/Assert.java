package org.junit;

public class Assert {

  public static void assertSame(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertSame(Object expected, Object actual) {
    assertSame(null, expected, actual);
  }
}

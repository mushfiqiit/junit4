package org.junit;

public class Assert {

  public static void assertNotSame(String message, Object unexpected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotSame(Object unexpected, Object actual) {
    assertNotSame(null, unexpected, actual);
  }
}

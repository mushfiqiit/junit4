package org.junit;

public class Assert {

  public static void assertNotEquals(String message, Object unexpected, Object actual) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(Object unexpected, Object actual) {
    assertNotEquals(null, unexpected, actual);
  }
}

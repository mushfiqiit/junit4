package org.junit;

public class Assert {

  @Deprecated
  public static void assertEquals(double expected, double actual) {
    assertEquals(null, expected, actual);
  }

  @Deprecated
  public static void assertEquals(String message, double expected, double actual) {
    throw new java.lang.Error();
  }
}

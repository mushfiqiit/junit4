package org.junit;

public class Assert {

  public static void assertNotEquals(
      String message, double unexpected, double actual, double delta) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(double unexpected, double actual, double delta) {
    assertNotEquals(null, unexpected, actual, delta);
  }
}

package org.junit;

public class Assert {

  public static void assertEquals(String message, float expected, float actual, float delta) {
    throw new java.lang.Error();
  }

  public static void assertEquals(float expected, float actual, float delta) {
    assertEquals(null, expected, actual, delta);
  }
}

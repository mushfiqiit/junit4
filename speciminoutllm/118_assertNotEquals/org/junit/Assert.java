package org.junit;

public class Assert {

  public static void assertNotEquals(float unexpected, float actual, float delta) {
    assertNotEquals(null, unexpected, actual, delta);
  }

  public static void assertNotEquals(String message, float unexpected, float actual, float delta) {
    throw new java.lang.Error();
  }
}

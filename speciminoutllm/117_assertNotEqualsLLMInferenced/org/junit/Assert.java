package org.junit;

import javax.annotation.Nullable;

public class Assert {

  public static void assertNotEquals(
      @Nullable String message, double unexpected, double actual, double delta) {
    throw new java.lang.Error();
  }

  public static void assertNotEquals(double unexpected, double actual, double delta) {
    assertNotEquals(null, unexpected, actual, delta);
  }
}

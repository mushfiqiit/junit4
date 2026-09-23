package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(
      String message, float[] expecteds, float[] actuals, float delta)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(float[] expecteds, float[] actuals, float delta) {
    assertArrayEquals(null, expecteds, actuals, delta);
  }
}

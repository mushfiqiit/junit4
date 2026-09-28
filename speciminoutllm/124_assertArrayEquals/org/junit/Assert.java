package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(String message, int[] expecteds, int[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(int[] expecteds, int[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

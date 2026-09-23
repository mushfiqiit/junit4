package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(String message, long[] expecteds, long[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(long[] expecteds, long[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

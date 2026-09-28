package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(String message, boolean[] expecteds, boolean[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(boolean[] expecteds, boolean[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

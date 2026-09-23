package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(String message, Object[] expecteds, Object[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(Object[] expecteds, Object[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

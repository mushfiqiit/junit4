package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(String message, char[] expecteds, char[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(char[] expecteds, char[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

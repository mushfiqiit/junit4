package org.junit;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(String message, byte[] expecteds, byte[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(byte[] expecteds, byte[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

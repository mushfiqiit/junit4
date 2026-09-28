package org.junit;

import javax.annotation.Nullable;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(
      @Nullable String message, short[] expecteds, short[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(short[] expecteds, short[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

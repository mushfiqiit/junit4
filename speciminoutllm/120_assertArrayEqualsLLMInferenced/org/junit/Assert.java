package org.junit;

import javax.annotation.Nullable;

import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(@Nullable String message, boolean[] expecteds, boolean[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(boolean[] expecteds, boolean[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

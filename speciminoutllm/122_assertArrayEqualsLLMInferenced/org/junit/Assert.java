package org.junit;

import org.junit.internal.ArrayComparisonFailure;

import javax.annotation.Nullable;

public class Assert {

  public static void assertArrayEquals(@Nullable String message, char[] expecteds, char[] actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(char[] expecteds, char[] actuals) {
    assertArrayEquals(null, expecteds, actuals);
  }
}

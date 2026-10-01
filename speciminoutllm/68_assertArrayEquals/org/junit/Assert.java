package org.junit;

import javax.annotation.Nullable;
import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(
      @Nullable String message, Object[] expecteds, Object[] actuals)
      throws ArrayComparisonFailure {
    internalArrayEquals(message, expecteds, actuals);
  }

  private static void internalArrayEquals(String message, Object expecteds, Object actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }
}

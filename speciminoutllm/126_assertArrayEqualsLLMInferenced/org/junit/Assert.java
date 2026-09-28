package org.junit;

import javax.annotation.Nullable;
import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(
      @Nullable String message, double[] expecteds, double[] actuals, double delta)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(double[] expecteds, double[] actuals, double delta) {
    assertArrayEquals(null, expecteds, actuals, delta);
  }
}

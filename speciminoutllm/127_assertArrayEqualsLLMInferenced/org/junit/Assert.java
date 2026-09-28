package org.junit;

import javax.annotation.Nullable;
import org.junit.internal.ArrayComparisonFailure;

public class Assert {

  public static void assertArrayEquals(
      @Nullable String message, float[] expecteds, float[] actuals, float delta)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }

  public static void assertArrayEquals(float[] expecteds, float[] actuals, float delta) {
    assertArrayEquals(null, expecteds, actuals, delta);
  }
}

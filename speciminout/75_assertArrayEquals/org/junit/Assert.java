package org.junit;

import javax.annotation.Nullable;
import org.junit.internal.ArrayComparisonFailure;
import org.junit.internal.InexactComparisonCriteria;

public class Assert {

  public static void assertArrayEquals(
      @Nullable String message, double[] expecteds, double[] actuals, double delta)
      throws ArrayComparisonFailure {
    new InexactComparisonCriteria(delta).arrayEquals(message, expecteds, actuals);
  }
}

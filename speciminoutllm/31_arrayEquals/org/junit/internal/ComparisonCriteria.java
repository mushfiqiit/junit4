package org.junit.internal;

import javax.annotation.Nullable;

public abstract class ComparisonCriteria {

  public void arrayEquals(@Nullable String message, Object expecteds, Object actuals)
      throws ArrayComparisonFailure {
    arrayEquals(message, expecteds, actuals, true);
  }

  private void arrayEquals(String message, Object expecteds, Object actuals, boolean outer)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }
}

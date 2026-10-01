package org.junit.internal;

import javax.annotation.Nullable;

public abstract class ComparisonCriteria {

  public void arrayEquals(@Nullable String message, Object expecteds, Object actuals)
      throws ArrayComparisonFailure {
    throw new java.lang.Error();
  }
}

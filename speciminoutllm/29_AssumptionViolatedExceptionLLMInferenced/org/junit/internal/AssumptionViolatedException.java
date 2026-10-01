package org.junit.internal;

import javax.annotation.Nullable;
import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;

public class AssumptionViolatedException extends RuntimeException implements SelfDescribing {

  private static final long serialVersionUID = 0L;

  private final String fAssumption;

  private final boolean fValueMatcher;

  @Nullable private final Object fValue;

  private final Matcher<?> fMatcher;

  @Deprecated
  public AssumptionViolatedException(
      @Nullable String assumption,
      boolean hasValue,
      @Nullable Object value,
      @Nullable Matcher<?> matcher) {
    this.fAssumption = assumption;
    this.fValue = value;
    this.fMatcher = matcher;
    this.fValueMatcher = hasValue;
    if (value instanceof Throwable) {
      initCause((Throwable) value);
    }
  }
}

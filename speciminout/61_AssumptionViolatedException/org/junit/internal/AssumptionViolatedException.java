package org.junit.internal;

import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;

public class AssumptionViolatedException extends RuntimeException implements SelfDescribing {

  private static final long serialVersionUID = 0L;

  private final String fAssumption;

  private final boolean fValueMatcher = false;

  private final Object fValue;

  private final Matcher<?> fMatcher;

  @Deprecated
  public AssumptionViolatedException(
      String assumption, boolean hasValue, Object value, Matcher<?> matcher) {
    throw new java.lang.Error();
  }

  @Deprecated
  public AssumptionViolatedException(Object value, Matcher<?> matcher) {
    this(null, true, value, matcher);
  }
}

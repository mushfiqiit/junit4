package org.junit.internal.runners;

import javax.annotation.Nonnull;

@Deprecated
public class TestMethod {

  @Nonnull
  protected Class<? extends Throwable> getExpectedException() {
    throw new java.lang.Error();
  }

  boolean isUnexpected(Throwable exception) {
    return !getExpectedException().isAssignableFrom(exception.getClass());
  }
}

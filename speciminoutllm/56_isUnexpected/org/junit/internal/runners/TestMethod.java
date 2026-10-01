package org.junit.internal.runners;

import javax.annotation.Nullable;

@Deprecated
public class TestMethod {

  @Nullable
  protected Class<? extends Throwable> getExpectedException() {
    throw new java.lang.Error();
  }

  boolean isUnexpected(Throwable exception) {
    return !getExpectedException().isAssignableFrom(exception.getClass());
  }
}

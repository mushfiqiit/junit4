package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import javax.annotation.Nonnull;

@Deprecated
public class TestMethod {

  @Nonnull
  protected Class<? extends Throwable> getExpectedException() {
    throw new java.lang.Error();
  }

  boolean isUnexpected(Throwable exception) {
    throw new java.lang.Error();
  }

  boolean expectsException() {
    throw new java.lang.Error();
  }

  public void invoke(Object test)
      throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    throw new java.lang.Error();
  }
}

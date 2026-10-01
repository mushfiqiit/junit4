package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import javax.annotation.Nullable;

@Deprecated
public class TestMethod {

  @Nullable
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

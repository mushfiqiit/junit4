package org.junit.internal.runners;

import javax.annotation.Nullable;
import org.junit.runner.Runner;

public class ErrorReportingRunner extends Runner {

  public ErrorReportingRunner(@Nullable Class<?> testClass, Throwable cause) {
    throw new java.lang.Error();
  }
}

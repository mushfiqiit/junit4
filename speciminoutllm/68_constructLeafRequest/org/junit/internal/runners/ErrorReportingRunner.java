package org.junit.internal.runners;

import org.junit.runner.Runner;

public class ErrorReportingRunner extends Runner {

  public ErrorReportingRunner(Class<?> testClass, Throwable cause) {
    throw new java.lang.Error();
  }
}

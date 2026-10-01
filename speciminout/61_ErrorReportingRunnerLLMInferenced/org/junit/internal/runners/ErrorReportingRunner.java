package org.junit.internal.runners;

import java.util.List;
import javax.annotation.Nullable;
import org.junit.runner.Runner;

public class ErrorReportingRunner extends Runner {

  private final List<Throwable> causes;

  private final String classNames;

  public ErrorReportingRunner(@Nullable Class<?> testClass, Throwable cause) {
    this(cause, testClass);
  }

  public ErrorReportingRunner(Throwable cause, @Nullable Class<?>... testClasses) {
    throw new java.lang.Error();
  }
}

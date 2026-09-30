package org.junit.runners.model;

import javax.annotation.Nullable;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.InvalidOrderingException;

public abstract class RunnerBuilder {

  @Nullable
  public abstract Runner runnerForClass(Class<?> testClass) throws Throwable;

  public Runner safeRunnerForClass(Class<?> testClass) {
    try {
      Runner runner = runnerForClass(testClass);
      if (runner != null) {
        configureRunner(runner);
      }
      return runner;
    } catch (Throwable e) {
      return new ErrorReportingRunner(testClass, e);
    }
  }

  private void configureRunner(Runner runner) throws InvalidOrderingException {
    throw new java.lang.Error();
  }
}

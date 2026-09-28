package org.junit.runners.model;

import org.junit.runner.Runner;

public abstract class RunnerBuilder {

  public abstract Runner runnerForClass(Class<?> testClass) throws Throwable;

  public Runner safeRunnerForClass(Class<?> testClass) {
    throw new java.lang.Error();
  }
}

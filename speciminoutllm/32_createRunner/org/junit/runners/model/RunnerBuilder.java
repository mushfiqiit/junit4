package org.junit.runners.model;

import javax.annotation.Nullable;
import org.junit.runner.Runner;

public abstract class RunnerBuilder {

  @Nullable
  public Runner safeRunnerForClass(Class<?> testClass) {
    throw new java.lang.Error();
  }
}

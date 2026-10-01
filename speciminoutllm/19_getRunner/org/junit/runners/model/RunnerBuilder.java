package org.junit.runners.model;

import javax.annotation.Nullable;
import org.junit.runner.Runner;

public abstract class RunnerBuilder {

  @Nullable
  public abstract Runner runnerForClass(Class<?> testClass) throws Throwable;
}

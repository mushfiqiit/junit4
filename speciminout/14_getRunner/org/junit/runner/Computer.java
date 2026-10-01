package org.junit.runner;

import javax.annotation.Nullable;
import org.junit.runners.model.RunnerBuilder;

public class Computer {

  @Nullable
  protected Runner getRunner(RunnerBuilder builder, Class<?> testClass) throws Throwable {
    throw new java.lang.Error();
  }
}

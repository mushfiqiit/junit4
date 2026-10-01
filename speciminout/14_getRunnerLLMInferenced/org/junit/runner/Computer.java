package org.junit.runner;

import javax.annotation.Nonnull;
import org.junit.runners.model.RunnerBuilder;

public class Computer {

  @Nonnull
  protected Runner getRunner(RunnerBuilder builder, Class<?> testClass) throws Throwable {
    throw new java.lang.Error();
  }
}

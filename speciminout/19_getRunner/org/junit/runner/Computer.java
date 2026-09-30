package org.junit.runner;

import org.junit.runners.model.RunnerBuilder;

public class Computer {

  protected Runner getRunner(RunnerBuilder builder, Class<?> testClass) throws Throwable {
    return builder.runnerForClass(testClass);
  }
}

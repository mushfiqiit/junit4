package org.junit.experimental;

import javax.annotation.Nullable;
import org.junit.runner.Computer;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

public class ParallelComputer extends Computer {

  private final boolean methods = false;

  private static Runner parallelize(@Nullable Runner runner) {
    throw new java.lang.Error();
  }

  protected Runner getRunner(RunnerBuilder builder, Class<?> testClass) throws Throwable {
    Runner runner = super.getRunner(builder, testClass);
    return methods ? parallelize(runner) : runner;
  }
}

package org.junit.runners;

import java.util.List;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

public class Suite extends ParentRunner<Runner> {

  private final List<Runner> runners;

  public Suite(RunnerBuilder builder, Class<?>[] classes) throws InitializationError {
    this(null, builder.runners(null, classes));
  }

  protected Suite(Class<?> klass, List<Runner> runners) throws InitializationError {
    super(klass);
  }
}

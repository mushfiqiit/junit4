package org.junit.runners;

import java.util.List;
import javax.annotation.Nullable;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

public class Suite extends ParentRunner<Runner> {

  public Suite(RunnerBuilder builder, Class<?>[] classes) throws InitializationError {
    this(null, builder.runners(null, classes));
  }

  protected Suite(@Nullable Class<?> klass, List<Runner> runners) throws InitializationError {
    super(klass);
  }
}

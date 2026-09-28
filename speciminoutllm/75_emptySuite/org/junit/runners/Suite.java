package org.junit.runners;

import java.util.List;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

public class Suite extends ParentRunner<Runner> {

  public static Runner emptySuite() {
    try {
      return new Suite((Class<?>) null, new Class<?>[0]);
    } catch (InitializationError e) {
      throw new RuntimeException("This shouldn't be possible");
    }
  }

  protected Suite(Class<?> klass, Class<?>[] suiteClasses) throws InitializationError {
    this(new AllDefaultPossibilitiesBuilder(), klass, suiteClasses);
  }

  protected Suite(RunnerBuilder builder, Class<?> klass, Class<?>[] suiteClasses)
      throws InitializationError {
    this(klass, builder.runners(klass, suiteClasses));
  }

  protected Suite(Class<?> klass, List<Runner> runners) throws InitializationError {
    super(klass);
  }
}

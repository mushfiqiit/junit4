package org.junit.runners.model;

import javax.annotation.Nullable;
import java.util.List;
import org.junit.runner.Runner;

public abstract class RunnerBuilder {

  public List<Runner> runners(@Nullable Class<?> parent, Class<?>[] children) throws InitializationError {
    throw new java.lang.Error();
  }
}

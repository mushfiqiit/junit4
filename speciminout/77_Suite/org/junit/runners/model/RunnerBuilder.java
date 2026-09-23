package org.junit.runners.model;

import java.util.List;
import org.junit.runner.Runner;

public abstract class RunnerBuilder {

  public List<Runner> runners(Class<?> parent, Class<?>[] children) throws InitializationError {
    throw new java.lang.Error();
  }
}

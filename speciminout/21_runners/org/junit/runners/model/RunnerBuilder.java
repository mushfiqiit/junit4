package org.junit.runners.model;

import java.util.List;
import javax.annotation.Nullable;
import org.junit.runner.Runner;

public abstract class RunnerBuilder {

  Class<?> addParent(Class<?> parent) throws InitializationError {
    throw new java.lang.Error();
  }

  void removeParent(Class<?> klass) {
    throw new java.lang.Error();
  }

  public List<Runner> runners(@Nullable Class<?> parent, Class<?>[] children)
      throws InitializationError {
    addParent(parent);
    try {
      return runners(children);
    } finally {
      removeParent(parent);
    }
  }

  private List<Runner> runners(Class<?>[] children) {
    throw new java.lang.Error();
  }
}

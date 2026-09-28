package org.junit.runners;

import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.InitializationError;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  protected ParentRunner(Class<?> testClass) throws InitializationError {
    throw new java.lang.Error();
  }
}

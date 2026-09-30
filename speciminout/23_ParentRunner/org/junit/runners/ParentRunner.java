package org.junit.runners;

import java.util.List;
import java.util.concurrent.locks.Lock;
import javax.annotation.Nullable;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerScheduler;
import org.junit.runners.model.TestClass;
import org.junit.validator.TestClassValidator;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  private static final List<TestClassValidator> VALIDATORS = null;

  private final Lock childrenLock = null;

  private final TestClass testClass;

  @Nullable private volatile List<T> filteredChildren;

  private volatile RunnerScheduler scheduler;

  protected ParentRunner(@Nullable Class<?> testClass) throws InitializationError {
    this.testClass = createTestClass(testClass);
    validate();
  }

  @Deprecated
  protected TestClass createTestClass(Class<?> testClass) {
    throw new java.lang.Error();
  }

  private void validate() throws InitializationError {
    throw new java.lang.Error();
  }
}

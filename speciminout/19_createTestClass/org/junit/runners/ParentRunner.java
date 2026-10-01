package org.junit.runners;

import javax.annotation.Nullable;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.TestClass;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  @Deprecated
  protected TestClass createTestClass(@Nullable Class<?> testClass) {
    return new TestClass(testClass);
  }
}

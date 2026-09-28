package org.junit.runners;

import java.util.List;
import org.junit.BeforeClass;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  private final TestClass testClass;

  protected Statement withBeforeClasses(Statement statement) {
    List<FrameworkMethod> befores = testClass.getAnnotatedMethods(BeforeClass.class);
    return befores.isEmpty() ? statement : new RunBefores(statement, befores, null);
  }
}

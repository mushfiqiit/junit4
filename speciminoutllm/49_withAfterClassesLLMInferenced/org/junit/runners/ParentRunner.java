package org.junit.runners;

import java.util.List;
import org.junit.AfterClass;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;
import org.junit.runners.model.TestClass;

public abstract class ParentRunner<T> extends Runner implements Filterable, Orderable {

  private final TestClass testClass;

  protected Statement withAfterClasses(Statement statement) {
    List<FrameworkMethod> afters = testClass.getAnnotatedMethods(AfterClass.class);
    return afters.isEmpty() ? statement : new RunAfters(statement, afters, null);
  }
}

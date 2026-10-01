package org.junit.internal.runners;

import java.lang.annotation.Annotation;
import junit.extensions.TestDecorator;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.runner.Describable;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;

public class JUnit38ClassRunner extends Runner implements Filterable, Orderable {

  public Description getDescription() {
    throw new java.lang.Error();
  }

  private static Description makeDescription(Test test) {
    if (test instanceof TestCase) {
      TestCase tc = (TestCase) test;
      return Description.createTestDescription(tc.getClass(), tc.getName(), getAnnotations(tc));
    } else if (test instanceof TestSuite) {
      TestSuite ts = (TestSuite) test;
      String name = ts.getName() == null ? createSuiteDescription(ts) : ts.getName();
      Description description = Description.createSuiteDescription(name);
      int n = ts.testCount();
      for (int i = 0; i < n; i++) {
        Description made = makeDescription(ts.testAt(i));
        description.addChild(made);
      }
      return description;
    } else if (test instanceof Describable) {
      Describable adapter = (Describable) test;
      return adapter.getDescription();
    } else if (test instanceof TestDecorator) {
      TestDecorator decorator = (TestDecorator) test;
      return makeDescription(decorator.getTest());
    } else {
      return Description.createSuiteDescription(test.getClass());
    }
  }

  private static Annotation[] getAnnotations(TestCase test) {
    throw new java.lang.Error();
  }

  private static String createSuiteDescription(TestSuite ts) {
    throw new java.lang.Error();
  }
}

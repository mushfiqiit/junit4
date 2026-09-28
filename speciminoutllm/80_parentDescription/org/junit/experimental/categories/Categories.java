package org.junit.experimental.categories;

import org.junit.runner.Description;
import org.junit.runner.manipulation.Filter;
import org.junit.runners.Suite;

public class Categories extends Suite {

  public static class CategoryFilter extends Filter {

    private static Description parentDescription(Description description) {
      Class<?> testClass = description.getTestClass();
      return testClass == null ? null : Description.createSuiteDescription(testClass);
    }
  }
}

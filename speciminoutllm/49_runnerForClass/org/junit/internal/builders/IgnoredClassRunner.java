package org.junit.internal.builders;

import org.junit.runner.Runner;

public class IgnoredClassRunner extends Runner {

  public IgnoredClassRunner(Class<?> testClass) {
    throw new java.lang.Error();
  }
}

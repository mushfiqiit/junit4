package org.junit.internal.builders;

import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

public class IgnoredBuilder extends RunnerBuilder {

  public Runner runnerForClass(Class<?> testClass) {
    throw new java.lang.Error();
  }
}

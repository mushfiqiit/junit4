package org.junit.internal.builders;

import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

public class AnnotatedBuilder extends RunnerBuilder {

  public Runner runnerForClass(Class<?> testClass) throws Exception {
    throw new java.lang.Error();
  }
}

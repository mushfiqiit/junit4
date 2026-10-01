package org.junit.internal.builders;

import javax.annotation.Nullable;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

public class SuiteMethodBuilder extends RunnerBuilder {

  @Nullable
  public Runner runnerForClass(Class<?> each) throws Throwable {
    throw new java.lang.Error();
  }
}

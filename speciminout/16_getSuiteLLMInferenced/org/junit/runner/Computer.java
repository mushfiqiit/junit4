package org.junit.runner;

import javax.annotation.Nullable;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;
import org.junit.runners.model.RunnerBuilder;

public class Computer {

  public Runner getSuite(final RunnerBuilder builder, Class<?>[] classes)
      throws InitializationError {
    return new Suite(
        new RunnerBuilder() {

          public @Nullable Runner runnerForClass(Class<?> testClass) throws Throwable {
            return getRunner(builder, testClass);
          }
        },
        classes) {

      protected String getName() {
        return "classes";
      }
    };
  }

  @Nullable
  protected Runner getRunner(RunnerBuilder builder, Class<?> testClass) throws Throwable {
    throw new java.lang.Error();
  }
}

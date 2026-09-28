package org.junit.internal.requests;

import org.junit.internal.builders.SuiteMethodBuilder;
import org.junit.runner.Runner;

public class ClassRequest extends MemoizingRequest {

  private final Class<?> fTestClass;

  private final boolean canUseSuiteMethod = false;

  private class CustomSuiteMethodBuilder extends SuiteMethodBuilder {

    public Runner runnerForClass(Class<?> testClass) throws Throwable {
      if (testClass == fTestClass && !canUseSuiteMethod) {
        return null;
      }
      return super.runnerForClass(testClass);
    }
  }
}

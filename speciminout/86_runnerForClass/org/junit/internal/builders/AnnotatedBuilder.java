package org.junit.internal.builders;

import org.junit.runner.RunWith;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

public class AnnotatedBuilder extends RunnerBuilder {

  public Runner runnerForClass(Class<?> testClass) throws Exception {
    for (Class<?> currentTestClass = testClass;
        currentTestClass != null;
        currentTestClass = getEnclosingClassForNonStaticMemberClass(currentTestClass)) {
      RunWith annotation = currentTestClass.getAnnotation(RunWith.class);
      if (annotation != null) {
        return buildRunner(annotation.value(), testClass);
      }
    }
    return null;
  }

  private Class<?> getEnclosingClassForNonStaticMemberClass(Class<?> currentTestClass) {
    throw new java.lang.Error();
  }

  public Runner buildRunner(Class<? extends Runner> runnerClass, Class<?> testClass)
      throws Exception {
    throw new java.lang.Error();
  }
}

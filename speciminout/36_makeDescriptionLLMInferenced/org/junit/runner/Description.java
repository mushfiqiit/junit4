package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class Description implements Serializable {

  public static Description createSuiteDescription(String name, Annotation... annotations) {
    throw new java.lang.Error();
  }

  public static Description createTestDescription(
      Class<?> clazz, @Nullable String name, Annotation... annotations) {
    throw new java.lang.Error();
  }

  public static Description createSuiteDescription(Class<?> testClass) {
    throw new java.lang.Error();
  }

  public void addChild(Description description) {
    throw new java.lang.Error();
  }
}

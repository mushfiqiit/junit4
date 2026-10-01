package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Description implements Serializable {

  public static Description createSuiteDescription(String name, Annotation... annotations) {
    throw new java.lang.Error();
  }

  public static Description createTestDescription(
      Class<?> clazz, String name, Annotation... annotations) {
    throw new java.lang.Error();
  }

  public static Description createSuiteDescription(Class<?> testClass) {
    throw new java.lang.Error();
  }

  public void addChild(Description description) {
    throw new java.lang.Error();
  }
}

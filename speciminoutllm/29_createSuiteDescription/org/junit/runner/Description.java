package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Description implements Serializable {

  public static Description createSuiteDescription(String name, Annotation... annotations) {
    return new Description(null, name, annotations);
  }

  private Description(Class<?> clazz, String displayName, Annotation... annotations) {
    throw new java.lang.Error();
  }
}

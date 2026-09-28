package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Description implements Serializable {

  public static final Description TEST_MECHANISM = new Description(null, "Test mechanism");

  private Description(Class<?> clazz, String displayName, Annotation... annotations) {
    throw new java.lang.Error();
  }
}

package org.junit.runners.model;

import java.lang.annotation.Annotation;

public class TestClass implements Annotatable {

  private final Class<?> clazz;

  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    if (clazz == null) {
      return null;
    }
    return clazz.getAnnotation(annotationType);
  }
}

package org.junit.runners.model;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class TestClass implements Annotatable {

  private final Class<?> clazz;

  public <T extends Annotation> @Nullable T getAnnotation(Class<T> annotationType) {
    if (clazz == null) {
      return null;
    }
    return clazz.getAnnotation(annotationType);
  }
}

package org.junit.runners.model;

import java.lang.annotation.Annotation;

public class TestClass implements Annotatable {

  public <T> void collectAnnotatedFieldValues(
      Object test,
      Class<? extends Annotation> annotationClass,
      Class<T> valueClass,
      MemberValueConsumer<T> consumer) {
    throw new java.lang.Error();
  }

  public <T> void collectAnnotatedMethodValues(
      Object test,
      Class<? extends Annotation> annotationClass,
      Class<T> valueClass,
      MemberValueConsumer<T> consumer) {
    throw new java.lang.Error();
  }
}

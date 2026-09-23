package org.junit.runners.model;

import java.lang.annotation.Annotation;
import java.util.List;

public class TestClass implements Annotatable {

  public List<FrameworkMethod> getAnnotatedMethods(Class<? extends Annotation> annotationClass) {
    throw new java.lang.Error();
  }
}

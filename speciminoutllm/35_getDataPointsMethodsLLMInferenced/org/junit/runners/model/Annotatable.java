package org.junit.runners.model;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public interface Annotatable {

  @Nullable
  <T extends Annotation> T getAnnotation(Class<T> annotationType);
}

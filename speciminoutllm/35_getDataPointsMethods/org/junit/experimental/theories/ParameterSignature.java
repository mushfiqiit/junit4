package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class ParameterSignature {

  @Nullable
  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    throw new java.lang.Error();
  }
}

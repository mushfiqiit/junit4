package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import javax.annotation.Nonnull;

public class ParameterSignature {

  @Nonnull
  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    throw new java.lang.Error();
  }
}

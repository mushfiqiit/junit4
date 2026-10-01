package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class ParameterSignature {

  private final Annotation[] annotations;

  public <T extends Annotation> @Nullable T findDeepAnnotation(Class<T> annotationType) {
    Annotation[] annotations2 = annotations;
    return findDeepAnnotation(annotations2, annotationType, 3);
  }

  @Nullable
  private <T extends Annotation> T findDeepAnnotation(
      Annotation[] annotations, Class<T> annotationType, int depth) {
    throw new java.lang.Error();
  }
}

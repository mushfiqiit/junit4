package org.junit.experimental.theories;

import java.lang.annotation.Annotation;

public class ParameterSignature {

  private <T extends Annotation> T findDeepAnnotation(
      Annotation[] annotations, Class<T> annotationType, int depth) {
    if (depth == 0) {
      return null;
    }
    for (Annotation each : annotations) {
      if (annotationType.isInstance(each)) {
        return annotationType.cast(each);
      }
      Annotation candidate =
          findDeepAnnotation(each.annotationType().getAnnotations(), annotationType, depth - 1);
      if (candidate != null) {
        return annotationType.cast(candidate);
      }
    }
    return null;
  }
}

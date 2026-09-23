package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Description implements Serializable {

  private final Annotation[] fAnnotations;

  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    for (Annotation each : fAnnotations) {
      if (each.annotationType().equals(annotationType)) {
        return annotationType.cast(each);
      }
    }
    return null;
  }
}

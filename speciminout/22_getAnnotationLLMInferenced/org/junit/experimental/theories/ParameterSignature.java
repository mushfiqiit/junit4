package org.junit.experimental.theories;

import java.lang.annotation.Annotation;
import java.util.List;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public class ParameterSignature {

  public List<Annotation> getAnnotations() {
    throw new java.lang.Error();
  }

  @Nullable
  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    for (Annotation each : getAnnotations()) {
      if (annotationType.isInstance(each)) {
        return annotationType.cast(each);
      }
    }
    return null;
  }
}

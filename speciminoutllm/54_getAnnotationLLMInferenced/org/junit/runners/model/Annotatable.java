package org.junit.runners.model;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public interface Annotatable {

  <T extends Annotation> @Nullable T getAnnotation(Class<T> annotationType);
}

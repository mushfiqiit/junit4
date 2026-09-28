package org.junit.runners.model;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {

  public Object invokeExplosively(final @Nullable Object target, final Object... params) throws Throwable {
    throw new java.lang.Error();
  }

  public String getName() {
    throw new java.lang.Error();
  }

  public Class<?> getReturnType() {
    throw new java.lang.Error();
  }

  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    throw new java.lang.Error();
  }
}

package org.junit.runners.model;

import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {

  public Object invokeExplosively(@Nullable final Object target, final Object... params) throws Throwable {
    throw new java.lang.Error();
  }

  public <T extends Annotation> T getAnnotation(Class<T> annotationType) {
    throw new java.lang.Error();
  }
}

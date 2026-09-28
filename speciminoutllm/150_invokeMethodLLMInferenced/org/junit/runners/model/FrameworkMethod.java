package org.junit.runners.model;

import java.lang.reflect.Method;
import javax.annotation.Nullable;

public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {

  public Method getMethod() {
    throw new java.lang.Error();
  }

  public Object invokeExplosively(final Object target, final @Nullable Object... params) throws Throwable {
    throw new java.lang.Error();
  }
}

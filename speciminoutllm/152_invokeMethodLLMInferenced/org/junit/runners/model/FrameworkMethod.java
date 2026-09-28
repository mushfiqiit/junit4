package org.junit.runners.model;

import javax.annotation.Nullable;
import java.lang.reflect.Method;

public class FrameworkMethod extends FrameworkMember<FrameworkMethod> {

  public Method getMethod() {
    throw new java.lang.Error();
  }

  public Object invokeExplosively(@Nullable final Object target, final Object... params) throws Throwable {
    throw new java.lang.Error();
  }
}

package org.junit.internal.runners;

import java.lang.reflect.Method;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import org.junit.Test;
import org.junit.Test.None;

@Deprecated
public class TestMethod {

  private final Method method;

  @Nullable
  protected Class<? extends Throwable> getExpectedException() {
    Test annotation = method.getAnnotation(Test.class);
    if (annotation == null || annotation.expected() == None.class) {
      return null;
    } else {
      return annotation.expected();
    }
  }
}

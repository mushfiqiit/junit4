package org.junit.runner;

import java.io.Serializable;
import javax.annotation.Nullable;

public class Description implements Serializable {

  private volatile Class<?> fTestClass;

  public String toString() {
    throw new java.lang.Error();
  }

  public String getClassName() {
    return fTestClass != null
        ? fTestClass.getName()
        : methodAndClassNamePatternGroupOrDefault(2, toString());
  }

  @Nullable
  private String methodAndClassNamePatternGroupOrDefault(
      int group, @Nullable String defaultString) {
    throw new java.lang.Error();
  }
}

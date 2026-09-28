package org.junit.runner;

import java.io.Serializable;
import javax.annotation.Nullable;

public class Description implements Serializable {

  public String getMethodName() {
    return methodAndClassNamePatternGroupOrDefault(1, null);
  }

  private String methodAndClassNamePatternGroupOrDefault(int group, @Nullable String defaultString) {
    throw new java.lang.Error();
  }
}

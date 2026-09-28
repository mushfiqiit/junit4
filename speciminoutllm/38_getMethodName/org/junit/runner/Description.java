package org.junit.runner;

import java.io.Serializable;

public class Description implements Serializable {

  public String getMethodName() {
    return methodAndClassNamePatternGroupOrDefault(1, null);
  }

  private String methodAndClassNamePatternGroupOrDefault(int group, String defaultString) {
    throw new java.lang.Error();
  }
}

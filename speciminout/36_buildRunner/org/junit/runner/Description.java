package org.junit.runner;

import java.io.Serializable;
import javax.annotation.Nullable;

public class Description implements Serializable {

  public String toString() {
    throw new java.lang.Error();
  }

  @Nullable
  public Class<?> getTestClass() {
    throw new java.lang.Error();
  }

  public String getMethodName() {
    throw new java.lang.Error();
  }
}

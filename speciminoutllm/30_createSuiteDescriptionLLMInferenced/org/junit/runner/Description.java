package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class Description implements Serializable {

  public static Description createSuiteDescription(
      String name, Serializable uniqueId, Annotation... annotations) {
    return new Description(null, name, uniqueId, annotations);
  }

  private Description(
      @Nullable Class<?> testClass, String displayName, Serializable uniqueId, Annotation... annotations) {
    throw new java.lang.Error();
  }
}

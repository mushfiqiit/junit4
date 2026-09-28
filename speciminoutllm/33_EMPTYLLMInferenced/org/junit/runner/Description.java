package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import javax.annotation.Nullable;

public class Description implements Serializable {

  public static final Description EMPTY = new Description(null, "No Tests");

  private Description(@Nullable Class<?> clazz, String displayName, Annotation... annotations) {
    throw new java.lang.Error();
  }
}

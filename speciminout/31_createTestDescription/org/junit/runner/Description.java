package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Description implements Serializable {

  public static Description createTestDescription(
      String className, String name, Annotation... annotations) {
    return new Description(null, formatDisplayName(name, className), annotations);
  }

  private static String formatDisplayName(String name, String className) {
    throw new java.lang.Error();
  }

  private Description(Class<?> clazz, String displayName, Annotation... annotations) {
    throw new java.lang.Error();
  }
}

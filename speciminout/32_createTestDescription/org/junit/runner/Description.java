package org.junit.runner;

import java.io.Serializable;
import java.lang.annotation.Annotation;

public class Description implements Serializable {

  public static Description createTestDescription(
      String className, String name, Serializable uniqueId) {
    return new Description(null, formatDisplayName(name, className), uniqueId);
  }

  private static String formatDisplayName(String name, String className) {
    throw new java.lang.Error();
  }

  private Description(
      Class<?> testClass, String displayName, Serializable uniqueId, Annotation... annotations) {
    throw new java.lang.Error();
  }
}

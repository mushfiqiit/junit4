package org.junit.runner;

import java.io.Serializable;

public class Description implements Serializable {

  private volatile Class<?> fTestClass;

  public Class<?> getTestClass() {
    if (fTestClass != null) {
      return fTestClass;
    }
    String name = getClassName();
    if (name == null) {
      return null;
    }
    try {
      fTestClass = Class.forName(name, false, getClass().getClassLoader());
      return fTestClass;
    } catch (ClassNotFoundException e) {
      return null;
    }
  }

  public String getClassName() {
    throw new java.lang.Error();
  }
}

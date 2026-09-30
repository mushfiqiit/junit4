package org.junit.internal.runners;

import junit.framework.Test;

public class SuiteMethod extends JUnit38ClassRunner {

  public SuiteMethod(Class<?> klass) throws Throwable {
    super(testFromSuiteMethod(klass));
  }

  public static Test testFromSuiteMethod(Class<?> klass) throws Throwable {
    throw new java.lang.Error();
  }
}

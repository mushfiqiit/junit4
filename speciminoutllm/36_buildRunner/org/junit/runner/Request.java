package org.junit.runner;

public abstract class Request {

  public static Request method(Class<?> clazz, String methodName) {
    throw new java.lang.Error();
  }

  public static Request aClass(Class<?> clazz) {
    throw new java.lang.Error();
  }

  public abstract Runner getRunner();
}

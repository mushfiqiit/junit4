package org.junit.runners.model;

public class InitializationError extends Exception {

  public InitializationError(String string) {
    throw new java.lang.Error();
  }
}

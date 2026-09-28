package org.junit.runners.model;

import java.util.List;

public class InitializationError extends Exception {

  public List<Throwable> getCauses() {
    throw new java.lang.Error();
  }
}

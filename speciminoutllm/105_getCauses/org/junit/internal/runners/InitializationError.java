package org.junit.internal.runners;

import java.util.List;

@Deprecated
public class InitializationError extends Exception {

  public List<Throwable> getCauses() {
    throw new java.lang.Error();
  }
}

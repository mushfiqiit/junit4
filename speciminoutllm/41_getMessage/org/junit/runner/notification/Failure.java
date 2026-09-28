package org.junit.runner.notification;

import java.io.Serializable;

public class Failure implements Serializable {

  public Throwable getException() {
    throw new java.lang.Error();
  }

  public String getMessage() {
    return getException().getMessage();
  }
}

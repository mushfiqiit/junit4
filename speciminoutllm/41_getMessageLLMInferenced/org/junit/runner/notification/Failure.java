package org.junit.runner.notification;

import java.io.Serializable;
import javax.annotation.Nullable;

public class Failure implements Serializable {

  public Throwable getException() {
    throw new java.lang.Error();
  }

  @Nullable
  public String getMessage() {
    return getException().getMessage();
  }
}

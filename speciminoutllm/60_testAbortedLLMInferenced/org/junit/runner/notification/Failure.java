package org.junit.runner.notification;

import java.io.Serializable;
import org.junit.runner.Description;

public class Failure implements Serializable {

  public Failure(Description description, Throwable thrownException) {
    throw new java.lang.Error();
  }
}

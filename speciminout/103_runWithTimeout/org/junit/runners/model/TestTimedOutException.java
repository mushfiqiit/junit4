package org.junit.runners.model;

import java.util.concurrent.TimeUnit;

public class TestTimedOutException extends Exception {

  public TestTimedOutException(long timeout, TimeUnit timeUnit) {
    throw new java.lang.Error();
  }
}

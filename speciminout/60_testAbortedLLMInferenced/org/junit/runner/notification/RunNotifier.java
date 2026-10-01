package org.junit.runner.notification;

import org.junit.runner.Description;

public class RunNotifier {

  public void fireTestStarted(final Description description) throws StoppedByUserException {
    throw new java.lang.Error();
  }

  public void fireTestFailure(Failure failure) {
    throw new java.lang.Error();
  }

  public void fireTestFinished(final Description description) {
    throw new java.lang.Error();
  }
}

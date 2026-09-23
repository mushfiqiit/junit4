package org.junit.rules;

import java.util.concurrent.Callable;
import org.junit.internal.AssumptionViolatedException;

public class ErrorCollector extends Verifier {

  public void addError(Throwable error) {
    throw new java.lang.Error();
  }

  public <T> T checkSucceeds(Callable<T> callable) {
    try {
      return callable.call();
    } catch (AssumptionViolatedException e) {
      AssertionError error = new AssertionError("Callable threw AssumptionViolatedException");
      error.initCause(e);
      addError(error);
      return null;
    } catch (Throwable e) {
      addError(e);
      return null;
    }
  }
}

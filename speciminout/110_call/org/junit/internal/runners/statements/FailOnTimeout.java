package org.junit.internal.runners.statements;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import org.junit.runners.model.Statement;

public class FailOnTimeout extends Statement {

  private final Statement originalStatement;

  public void evaluate() throws Throwable {
    throw new java.lang.Error();
  }

  private class CallableStatement implements Callable<Throwable> {

    private final CountDownLatch startLatch;

    public Throwable call() throws Exception {
      try {
        startLatch.countDown();
        originalStatement.evaluate();
      } catch (Exception e) {
        throw e;
      } catch (Throwable e) {
        return e;
      }
      return null;
    }
  }
}

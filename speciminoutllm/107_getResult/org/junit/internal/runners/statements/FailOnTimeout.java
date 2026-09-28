package org.junit.internal.runners.statements;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.runners.model.Statement;

public class FailOnTimeout extends Statement {

  private final TimeUnit timeUnit;

  private final long timeout = 0L;

  private Throwable getResult(FutureTask<Throwable> task, Thread thread) {
    try {
      if (timeout > 0) {
        return task.get(timeout, timeUnit);
      } else {
        return task.get();
      }
    } catch (InterruptedException e) {
      return e;
    } catch (ExecutionException e) {
      return e.getCause();
    } catch (TimeoutException e) {
      return createTimeoutException(thread);
    }
  }

  private Exception createTimeoutException(Thread thread) {
    throw new java.lang.Error();
  }
}

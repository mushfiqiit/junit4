package org.junit.internal.runners;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.runners.model.TestTimedOutException;

@Deprecated
public class MethodRoadie {

  private void runWithTimeout(final long timeout) {
    runBeforesThenTestThenAfters(
        new Runnable() {

          public void run() {
            ExecutorService service = Executors.newSingleThreadExecutor();
            Callable<Object> callable =
                new Callable<Object>() {

                  public Object call() throws Exception {
                    runTestMethod();
                    return null;
                  }
                };
            Future<Object> result = service.submit(callable);
            service.shutdown();
            try {
              boolean terminated = service.awaitTermination(timeout, TimeUnit.MILLISECONDS);
              if (!terminated) {
                service.shutdownNow();
              }
              result.get(0, TimeUnit.MILLISECONDS);
            } catch (TimeoutException e) {
              addFailure(new TestTimedOutException(timeout, TimeUnit.MILLISECONDS));
            } catch (Exception e) {
              addFailure(e);
            }
          }
        });
  }

  public void runBeforesThenTestThenAfters(Runnable test) {
    throw new java.lang.Error();
  }

  protected void runTestMethod() {
    throw new java.lang.Error();
  }

  protected void addFailure(Throwable e) {
    throw new java.lang.Error();
  }
}

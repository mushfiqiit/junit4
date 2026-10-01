package org.junit.experimental.max;

import javax.annotation.Nonnull;
import java.io.Serializable;
import java.util.Map;
import org.junit.runner.Description;
import org.junit.runner.notification.RunListener;

public class MaxHistory implements Serializable {

  void putTestDuration(Description description, long duration) {
    throw new java.lang.Error();
  }

  private final class RememberingListener extends RunListener {

    private @Nonnull Map<Description, @Nonnull Long> starts;

    public void testFinished(Description description) throws Exception {
      long end = System.nanoTime();
      long start = starts.get(description);
      putTestDuration(description, end - start);
    }
  }
}

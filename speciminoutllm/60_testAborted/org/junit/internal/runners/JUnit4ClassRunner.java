package org.junit.internal.runners;

import javax.annotation.Nullable;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunNotifier;

@Deprecated
public class JUnit4ClassRunner extends Runner implements Filterable, Sortable {

  private void testAborted(RunNotifier notifier, Description description, @Nullable Throwable e) {
    notifier.fireTestStarted(description);
    notifier.fireTestFailure(new Failure(description, e));
    notifier.fireTestFinished(description);
  }
}

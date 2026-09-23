package org.junit.internal.runners.statements;

import org.junit.runners.model.Statement;

public class FailOnTimeout extends Statement {

  private final boolean lookForStuckThread = false;

  private ThreadGroup threadGroupForNewThread() {
    if (!lookForStuckThread) {
      return null;
    }
    ThreadGroup threadGroup = new ThreadGroup("FailOnTimeoutGroup");
    if (!threadGroup.isDaemon()) {
      try {
        threadGroup.setDaemon(true);
      } catch (SecurityException e) {
      }
    }
    return threadGroup;
  }
}

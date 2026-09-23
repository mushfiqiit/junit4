package org.junit.internal.runners.statements;

import java.util.List;
import org.junit.runners.model.Statement;

public class FailOnTimeout extends Statement {

  private Thread getStuckThread(Thread mainThread) {
    List<Thread> threadsInGroup = getThreadsInGroup(mainThread.getThreadGroup());
    if (threadsInGroup.isEmpty()) {
      return null;
    }
    Thread stuckThread = null;
    long maxCpuTime = 0;
    for (Thread thread : threadsInGroup) {
      if (thread.getState() == Thread.State.RUNNABLE) {
        long threadCpuTime = cpuTime(thread);
        if (stuckThread == null || threadCpuTime > maxCpuTime) {
          stuckThread = thread;
          maxCpuTime = threadCpuTime;
        }
      }
    }
    return (stuckThread == mainThread) ? null : stuckThread;
  }

  private List<Thread> getThreadsInGroup(ThreadGroup group) {
    throw new java.lang.Error();
  }

  private long cpuTime(Thread thr) {
    throw new java.lang.Error();
  }
}

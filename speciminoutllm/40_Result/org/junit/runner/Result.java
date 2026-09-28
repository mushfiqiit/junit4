package org.junit.runner;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.runner.notification.Failure;

public class Result implements Serializable {

  private static final long serialVersionUID = 0L;

  private static final ObjectStreamField[] serialPersistentFields;

  private final AtomicInteger count;

  private final AtomicInteger ignoreCount;

  private final AtomicInteger assumptionFailureCount;

  private final CopyOnWriteArrayList<Failure> failures;

  private final AtomicLong runTime;

  private final AtomicLong startTime;

  private SerializedForm serializedForm;

  private Result(SerializedForm serializedForm) {
    count = serializedForm.fCount;
    ignoreCount = serializedForm.fIgnoreCount;
    assumptionFailureCount = serializedForm.assumptionFailureCount;
    failures = new CopyOnWriteArrayList<Failure>(serializedForm.fFailures);
    runTime = new AtomicLong(serializedForm.fRunTime);
    startTime = new AtomicLong(serializedForm.fStartTime);
  }

  private static class SerializedForm implements Serializable {

    private final AtomicInteger fCount;

    private final AtomicInteger fIgnoreCount;

    private final AtomicInteger assumptionFailureCount;

    private final List<Failure> fFailures;

    private final long fRunTime = 0L;

    private final long fStartTime = 0L;
  }
}

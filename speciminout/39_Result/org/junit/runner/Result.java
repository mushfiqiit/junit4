package org.junit.runner;

import java.io.ObjectStreamField;
import java.io.Serializable;
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

  public Result() {
    count = new AtomicInteger();
    ignoreCount = new AtomicInteger();
    assumptionFailureCount = new AtomicInteger();
    failures = new CopyOnWriteArrayList<Failure>();
    runTime = new AtomicLong();
    startTime = new AtomicLong();
  }

  private static class SerializedForm implements Serializable {}
}

package org.junit;

import org.junit.function.ThrowingRunnable;

public class Assert {

  public static <T extends Throwable> T assertThrows(
      Class<T> expectedThrowable, ThrowingRunnable runnable) {
    return assertThrows(null, expectedThrowable, runnable);
  }

  public static <T extends Throwable> T assertThrows(
      String message, Class<T> expectedThrowable, ThrowingRunnable runnable) {
    throw new java.lang.Error();
  }
}

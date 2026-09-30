package org.junit;

import javax.annotation.Nullable;
import org.junit.function.ThrowingRunnable;

public class Assert {

  static String format(String message, Object expected, Object actual) {
    throw new java.lang.Error();
  }

  private static String formatClass(Class<?> value) {
    throw new java.lang.Error();
  }

  public static <T extends Throwable> T assertThrows(
      @Nullable String message, Class<T> expectedThrowable, ThrowingRunnable runnable) {
    try {
      runnable.run();
    } catch (Throwable actualThrown) {
      if (expectedThrowable.isInstance(actualThrown)) {
        @SuppressWarnings("unchecked")
        T retVal = (T) actualThrown;
        return retVal;
      } else {
        String expected = formatClass(expectedThrowable);
        Class<? extends Throwable> actualThrowable = actualThrown.getClass();
        String actual = formatClass(actualThrowable);
        if (expected.equals(actual)) {
          expected += "@" + Integer.toHexString(System.identityHashCode(expectedThrowable));
          actual += "@" + Integer.toHexString(System.identityHashCode(actualThrowable));
        }
        String mismatchMessage =
            buildPrefix(message) + format("unexpected exception type thrown;", expected, actual);
        AssertionError assertionError = new AssertionError(mismatchMessage);
        assertionError.initCause(actualThrown);
        throw assertionError;
      }
    }
    String notThrownMessage =
        buildPrefix(message)
            + String.format(
                "expected %s to be thrown, but nothing was thrown", formatClass(expectedThrowable));
    throw new AssertionError(notThrownMessage);
  }

  private static String buildPrefix(String message) {
    throw new java.lang.Error();
  }
}

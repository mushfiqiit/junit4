package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import org.junit.internal.AssumptionViolatedException;

@Deprecated
public class MethodRoadie {

  private final Object test = null;

  private TestMethod testMethod;

  protected void runTestMethod() {
    try {
      testMethod.invoke(test);
      if (testMethod.expectsException()) {
        addFailure(
            new AssertionError(
                "Expected exception: " + testMethod.getExpectedException().getName()));
      }
    } catch (InvocationTargetException e) {
      Throwable actual = e.getTargetException();
      if (actual instanceof AssumptionViolatedException) {
        return;
      } else if (!testMethod.expectsException()) {
        addFailure(actual);
      } else if (testMethod.isUnexpected(actual)) {
        String message =
            "Unexpected exception, expected<"
                + testMethod.getExpectedException().getName()
                + "> but was<"
                + actual.getClass().getName()
                + ">";
        addFailure(new Exception(message, actual));
      }
    } catch (Throwable e) {
      addFailure(e);
    }
  }

  protected void addFailure(Throwable e) {
    throw new java.lang.Error();
  }
}

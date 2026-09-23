package org.junit.internal.runners;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.runner.Description;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Sortable;
import org.junit.runner.notification.RunNotifier;

@Deprecated
public class JUnit4ClassRunner extends Runner implements Filterable, Sortable {

  protected Object createTest() throws Exception {
    throw new java.lang.Error();
  }

  protected void invokeTestMethod(Method method, RunNotifier notifier) {
    Description description = methodDescription(method);
    Object test;
    try {
      test = createTest();
    } catch (InvocationTargetException e) {
      testAborted(notifier, description, e.getCause());
      return;
    } catch (Exception e) {
      testAborted(notifier, description, e);
      return;
    }
    TestMethod testMethod = wrapMethod(method);
    new MethodRoadie(test, testMethod, notifier, description).run();
  }

  private void testAborted(RunNotifier notifier, Description description, Throwable e) {
    throw new java.lang.Error();
  }

  protected TestMethod wrapMethod(Method method) {
    throw new java.lang.Error();
  }

  protected Description methodDescription(Method method) {
    throw new java.lang.Error();
  }
}

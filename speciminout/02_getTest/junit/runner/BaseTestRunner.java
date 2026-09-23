package junit.runner;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import junit.framework.Test;
import junit.framework.TestListener;
import junit.framework.TestSuite;

public abstract class BaseTestRunner implements TestListener {

  public static final String SUITE_METHODNAME;

  public Test getTest(String suiteClassName) {
    if (suiteClassName.length() <= 0) {
      clearStatus();
      return null;
    }
    Class<?> testClass = null;
    try {
      testClass = loadSuiteClass(suiteClassName);
    } catch (ClassNotFoundException e) {
      String clazz = e.getMessage();
      if (clazz == null) {
        clazz = suiteClassName;
      }
      runFailed("Class not found \"" + clazz + "\"");
      return null;
    } catch (Exception e) {
      runFailed("Error: " + e.toString());
      return null;
    }
    Method suiteMethod = null;
    try {
      suiteMethod = testClass.getMethod(SUITE_METHODNAME);
    } catch (Exception e) {
      clearStatus();
      return new TestSuite(testClass);
    }
    if (!Modifier.isStatic(suiteMethod.getModifiers())) {
      runFailed("Suite() method must be static");
      return null;
    }
    Test test = null;
    try {
      test = (Test) suiteMethod.invoke(null);
      if (test == null) {
        return test;
      }
    } catch (InvocationTargetException e) {
      runFailed("Failed to invoke suite():" + e.getTargetException().toString());
      return null;
    } catch (IllegalAccessException e) {
      runFailed("Failed to invoke suite():" + e.toString());
      return null;
    }
    clearStatus();
    return test;
  }

  protected abstract void runFailed(String message);

  protected Class<?> loadSuiteClass(String suiteClassName) throws ClassNotFoundException {
    throw new java.lang.Error();
  }

  protected void clearStatus() {
    throw new java.lang.Error();
  }
}

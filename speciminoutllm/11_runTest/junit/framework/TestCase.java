package junit.framework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

@SuppressWarnings("deprecation")
public abstract class TestCase extends Assert implements Test {

  private String fName;

  protected void runTest() throws Throwable {
    assertNotNull("TestCase.fName cannot be null", fName);
    Method runMethod = null;
    try {
      runMethod = getClass().getMethod(fName, (Class[]) null);
    } catch (NoSuchMethodException e) {
      fail("Method \"" + fName + "\" not found");
    }
    if (!Modifier.isPublic(runMethod.getModifiers())) {
      fail("Method \"" + fName + "\" should be public");
    }
    try {
      runMethod.invoke(this);
    } catch (InvocationTargetException e) {
      e.fillInStackTrace();
      throw e.getTargetException();
    } catch (IllegalAccessException e) {
      e.fillInStackTrace();
      throw e;
    }
  }

  public static void fail(String message) {
    throw new java.lang.Error();
  }

  public static void assertNotNull(String message, Object object) {
    throw new java.lang.Error();
  }
}

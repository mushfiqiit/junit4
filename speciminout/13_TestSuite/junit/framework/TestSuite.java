package junit.framework;

import java.util.Vector;
import javax.annotation.Nullable;

public class TestSuite implements Test {

  private String fName;

  private Vector<Test> fTests;

  public TestSuite(@Nullable final Class<?> theClass) {
    addTestsFromTestCase(theClass);
  }

  private void addTestsFromTestCase(final Class<?> theClass) {
    throw new java.lang.Error();
  }

  public TestSuite(Class<?>... classes) {
    for (Class<?> each : classes) {
      addTest(testCaseForClass(each));
    }
  }

  private Test testCaseForClass(Class<?> each) {
    throw new java.lang.Error();
  }

  public void addTest(Test test) {
    throw new java.lang.Error();
  }
}

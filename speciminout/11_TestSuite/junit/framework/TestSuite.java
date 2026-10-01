package junit.framework;

import java.util.Vector;

public class TestSuite implements Test {

  private String fName;

  private Vector<Test> fTests;

  public TestSuite(String name) {
    setName(name);
  }

  public void setName(String name) {
    throw new java.lang.Error();
  }
}

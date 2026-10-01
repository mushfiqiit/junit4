package junit.textui;

import junit.framework.Test;
import junit.framework.TestResult;
import junit.runner.BaseTestRunner;
import junit.runner.Version;

public class TestRunner extends BaseTestRunner {

  public TestResult doRun(Test suite, boolean wait) {
    throw new java.lang.Error();
  }

  public TestResult start(String[] args) throws Exception {
    String testCase = "";
    String method = "";
    boolean wait = false;
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-wait")) {
        wait = true;
      } else if (args[i].equals("-c")) {
        testCase = extractClassName(args[++i]);
      } else if (args[i].equals("-m")) {
        String arg = args[++i];
        int lastIndex = arg.lastIndexOf('.');
        testCase = arg.substring(0, lastIndex);
        method = arg.substring(lastIndex + 1);
      } else if (args[i].equals("-v")) {
        System.err.println("JUnit " + Version.id() + " by Kent Beck and Erich Gamma");
      } else {
        testCase = args[i];
      }
    }
    if (testCase.equals("")) {
      throw new Exception(
          "Usage: TestRunner [-wait] testCaseName, where name is the name of the TestCase class");
    }
    try {
      if (!method.equals("")) {
        return runSingleMethod(testCase, method, wait);
      }
      Test suite = getTest(testCase);
      return doRun(suite, wait);
    } catch (Exception e) {
      throw new Exception("Could not create and run test suite: " + e);
    }
  }

  protected TestResult runSingleMethod(String testCase, String method, boolean wait)
      throws Exception {
    throw new java.lang.Error();
  }
}

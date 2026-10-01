package junit.textui;

import javax.annotation.Nullable;
import junit.framework.Test;
import junit.framework.TestResult;
import junit.runner.BaseTestRunner;

public class TestRunner extends BaseTestRunner {

  private ResultPrinter fPrinter;

  protected TestResult createTestResult() {
    throw new java.lang.Error();
  }

  public TestResult doRun(Test suite, boolean wait) {
    TestResult result = createTestResult();
    result.addListener(fPrinter);
    long startTime = System.currentTimeMillis();
    suite.run(result);
    long endTime = System.currentTimeMillis();
    long runTime = endTime - startTime;
    fPrinter.print(result, runTime);
    pause(wait);
    return result;
  }

  protected void pause(boolean wait) {
    throw new java.lang.Error();
  }
}

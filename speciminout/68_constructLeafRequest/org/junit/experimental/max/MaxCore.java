package org.junit.experimental.max;

import java.util.ArrayList;
import java.util.List;
import org.junit.internal.runners.ErrorReportingRunner;
import org.junit.runner.Description;
import org.junit.runner.Request;
import org.junit.runner.Runner;
import org.junit.runners.Suite;
import org.junit.runners.model.InitializationError;

public class MaxCore {

  private Request constructLeafRequest(List<Description> leaves) {
    final List<Runner> runners = new ArrayList<Runner>();
    for (Description each : leaves) {
      runners.add(buildRunner(each));
    }
    return new Request() {

      public Runner getRunner() {
        try {
          return new Suite((Class<?>) null, runners) {};
        } catch (InitializationError e) {
          return new ErrorReportingRunner(null, e);
        }
      }
    };
  }

  private Runner buildRunner(Description each) {
    throw new java.lang.Error();
  }
}

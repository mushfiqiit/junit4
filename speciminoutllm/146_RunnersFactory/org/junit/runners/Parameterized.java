package org.junit.runners;

import java.util.Collections;
import java.util.List;
import org.junit.internal.AssumptionViolatedException;
import org.junit.runner.Runner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.TestClass;
import org.junit.runners.parameterized.ParametersRunnerFactory;

public class Parameterized extends Suite {

  private static class AssumptionViolationRunner extends Runner {

    AssumptionViolationRunner(
        TestClass testClass, String methodName, AssumptionViolatedException exception) {
      throw new java.lang.Error();
    }
  }

  private static class RunnersFactory {

    private static final ParametersRunnerFactory DEFAULT_FACTORY;

    private final TestClass testClass;

    private final FrameworkMethod parametersMethod;

    private final List<Object> allParameters;

    private final int parameterCount;

    private final Runner runnerOverride;

    private RunnersFactory(Class<?> klass) throws Throwable {
      testClass = new TestClass(klass);
      parametersMethod = getParametersMethod(testClass);
      List<Object> allParametersResult;
      AssumptionViolationRunner assumptionViolationRunner = null;
      try {
        allParametersResult = allParameters(testClass, parametersMethod);
      } catch (AssumptionViolatedException e) {
        allParametersResult = Collections.emptyList();
        assumptionViolationRunner =
            new AssumptionViolationRunner(testClass, parametersMethod.getName(), e);
      }
      allParameters = allParametersResult;
      runnerOverride = assumptionViolationRunner;
      parameterCount =
          allParameters.isEmpty() ? 0 : normalizeParameters(allParameters.get(0)).length;
    }

    private static Object[] normalizeParameters(Object parametersOrSingleParameter) {
      throw new java.lang.Error();
    }

    @SuppressWarnings("unchecked")
    private static List<Object> allParameters(TestClass testClass, FrameworkMethod parametersMethod)
        throws Throwable {
      throw new java.lang.Error();
    }

    private static FrameworkMethod getParametersMethod(TestClass testClass) throws Exception {
      throw new java.lang.Error();
    }
  }
}

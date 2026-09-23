package org.junit.internal.builders;

import java.util.Arrays;
import java.util.List;
import org.junit.runner.Runner;
import org.junit.runners.model.RunnerBuilder;

public class AllDefaultPossibilitiesBuilder extends RunnerBuilder {

  public Runner runnerForClass(Class<?> testClass) throws Throwable {
    List<RunnerBuilder> builders =
        Arrays.asList(
            ignoredBuilder(),
            annotatedBuilder(),
            suiteMethodBuilder(),
            junit3Builder(),
            junit4Builder());
    for (RunnerBuilder each : builders) {
      Runner runner = each.safeRunnerForClass(testClass);
      if (runner != null) {
        return runner;
      }
    }
    return null;
  }

  protected JUnit4Builder junit4Builder() {
    throw new java.lang.Error();
  }

  protected JUnit3Builder junit3Builder() {
    throw new java.lang.Error();
  }

  protected AnnotatedBuilder annotatedBuilder() {
    throw new java.lang.Error();
  }

  protected IgnoredBuilder ignoredBuilder() {
    throw new java.lang.Error();
  }

  protected RunnerBuilder suiteMethodBuilder() {
    throw new java.lang.Error();
  }
}

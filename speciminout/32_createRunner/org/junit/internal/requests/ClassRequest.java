package org.junit.internal.requests;

import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Runner;

public class ClassRequest extends MemoizingRequest {

  private final Class<?> fTestClass = null;

  protected Runner createRunner() {
    return new CustomAllDefaultPossibilitiesBuilder().safeRunnerForClass(fTestClass);
  }

  private class CustomAllDefaultPossibilitiesBuilder extends AllDefaultPossibilitiesBuilder {}
}

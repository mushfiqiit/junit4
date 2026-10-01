package org.junit.internal.requests;

import javax.annotation.Nullable;
import org.junit.internal.builders.AllDefaultPossibilitiesBuilder;
import org.junit.runner.Runner;

public class ClassRequest extends MemoizingRequest {

  private final Class<?> fTestClass;

  @Nullable
  protected Runner createRunner() {
    return new CustomAllDefaultPossibilitiesBuilder().safeRunnerForClass(fTestClass);
  }

  private class CustomAllDefaultPossibilitiesBuilder extends AllDefaultPossibilitiesBuilder {}
}

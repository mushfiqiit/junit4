package org.junit.runners.model;

import java.util.Set;
import javax.annotation.Nullable;

public abstract class RunnerBuilder {

  private final Set<Class<?>> parents;

  @Nullable Class<?> addParent(@Nullable Class<?> parent) throws InitializationError {
    if (!parents.add(parent)) {
      throw new InitializationError(
          String.format(
              "class '%s' (possibly indirectly) contains itself as a SuiteClass",
              parent.getName()));
    }
    return parent;
  }
}

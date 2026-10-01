package org.junit.internal.runners.statements;

import java.util.List;
import javax.annotation.Nullable;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class RunBefores extends Statement {

  private final Statement next;

  private final Object target;

  private final List<FrameworkMethod> befores;

  public RunBefores(Statement next, List<FrameworkMethod> befores, @Nullable Object target) {
    this.next = next;
    this.befores = befores;
    this.target = target;
  }
}

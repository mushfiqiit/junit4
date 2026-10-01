package org.junit.internal.runners.statements;

import java.util.List;
import javax.annotation.Nullable;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class RunAfters extends Statement {

  private final Statement next;

  @Nullable
  private final Object target;

  private final List<FrameworkMethod> afters;

  public RunAfters(Statement next, List<FrameworkMethod> afters, @Nullable Object target) {
    this.next = next;
    this.afters = afters;
    this.target = target;
  }
}

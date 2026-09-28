package org.junit.runners.parameterized;

import java.util.List;
import org.junit.internal.runners.statements.RunBefores;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {

  private class RunBeforeParams extends RunBefores {

    RunBeforeParams(Statement next, List<FrameworkMethod> befores) {
      super(next, befores, null);
    }
  }
}

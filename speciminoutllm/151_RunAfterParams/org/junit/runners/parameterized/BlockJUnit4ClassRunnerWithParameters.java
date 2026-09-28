package org.junit.runners.parameterized;

import java.util.List;
import org.junit.internal.runners.statements.RunAfters;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.Statement;

public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {

  private class RunAfterParams extends RunAfters {

    RunAfterParams(Statement next, List<FrameworkMethod> afters) {
      super(next, afters, null);
    }
  }
}

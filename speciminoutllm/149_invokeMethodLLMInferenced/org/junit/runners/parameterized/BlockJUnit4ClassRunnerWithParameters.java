package org.junit.runners.parameterized;

import org.junit.internal.runners.statements.RunBefores;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;

public class BlockJUnit4ClassRunnerWithParameters extends BlockJUnit4ClassRunner {

  private final Object[] parameters;

  private class RunBeforeParams extends RunBefores {

    protected void invokeMethod(FrameworkMethod method) throws Throwable {
      int paramCount = method.getMethod().getParameterTypes().length;
      method.invokeExplosively(null, paramCount == 0 ? (Object[]) null : parameters);
    }
  }
}

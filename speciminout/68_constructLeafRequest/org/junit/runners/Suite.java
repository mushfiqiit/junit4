package org.junit.runners;

import java.util.List;
import org.junit.runner.Runner;
import org.junit.runners.model.InitializationError;

public class Suite extends ParentRunner<Runner> {

  protected Suite(Class<?> klass, List<Runner> runners) throws InitializationError {
    super(klass);
  }
}

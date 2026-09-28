package org.junit.runners;

import org.junit.Test;
import org.junit.Test.None;
import org.junit.runners.model.FrameworkMethod;

public class BlockJUnit4ClassRunner extends ParentRunner<FrameworkMethod> {

  private Class<? extends Throwable> getExpectedException(Test annotation) {
    if (annotation == null || annotation.expected() == None.class) {
      return null;
    } else {
      return annotation.expected();
    }
  }
}

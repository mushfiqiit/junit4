package org.junit.internal.runners;

import javax.annotation.Nullable;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestListener;
import org.junit.runner.Runner;
import org.junit.runner.manipulation.Filterable;
import org.junit.runner.manipulation.Orderable;

public class JUnit38ClassRunner extends Runner implements Filterable, Orderable {

  private static final class OldTestClassAdaptingListener implements TestListener {

    @Nullable
    private String getName(Test test) {
      if (test instanceof TestCase) {
        return ((TestCase) test).getName();
      } else {
        return test.toString();
      }
    }
  }
}

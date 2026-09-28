package org.junit.internal.builders;

import java.lang.reflect.Modifier;
import javax.annotation.Nullable;
import org.junit.runners.model.RunnerBuilder;

public class AnnotatedBuilder extends RunnerBuilder {

  private @Nullable Class<?> getEnclosingClassForNonStaticMemberClass(Class<?> currentTestClass) {
    if (currentTestClass.isMemberClass() && !Modifier.isStatic(currentTestClass.getModifiers())) {
      return currentTestClass.getEnclosingClass();
    } else {
      return null;
    }
  }
}

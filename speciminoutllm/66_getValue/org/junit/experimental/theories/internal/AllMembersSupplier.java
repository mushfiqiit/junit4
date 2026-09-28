package org.junit.experimental.theories.internal;

import org.junit.Assume;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.FrameworkMethod;

public class AllMembersSupplier extends ParameterSupplier {

  static class MethodParameterValue extends PotentialAssignment {

    private final FrameworkMethod method;

    public Object getValue() throws CouldNotGenerateValueException {
      try {
        return method.invokeExplosively(null);
      } catch (IllegalArgumentException e) {
        throw new RuntimeException("unexpected: argument length is checked");
      } catch (IllegalAccessException e) {
        throw new RuntimeException("unexpected: getMethods returned an inaccessible method");
      } catch (Throwable throwable) {
        DataPoint annotation = method.getAnnotation(DataPoint.class);
        Assume.assumeTrue(
            annotation == null || !isAssignableToAnyOf(annotation.ignoredExceptions(), throwable));
        throw new CouldNotGenerateValueException(throwable);
      }
    }
  }

  private static boolean isAssignableToAnyOf(Class<?>[] typeArray, Object target) {
    throw new java.lang.Error();
  }
}

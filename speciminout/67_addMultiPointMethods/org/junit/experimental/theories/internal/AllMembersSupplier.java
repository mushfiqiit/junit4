package org.junit.experimental.theories.internal;

import java.util.Collection;
import java.util.List;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.experimental.theories.PotentialAssignment;
import org.junit.runners.model.FrameworkMethod;

public class AllMembersSupplier extends ParameterSupplier {

  private void addMultiPointMethods(ParameterSignature sig, List<PotentialAssignment> list)
      throws Throwable {
    for (FrameworkMethod dataPointsMethod : getDataPointsMethods(sig)) {
      Class<?> returnType = dataPointsMethod.getReturnType();
      if ((returnType.isArray() && sig.canPotentiallyAcceptType(returnType.getComponentType()))
          || Iterable.class.isAssignableFrom(returnType)) {
        try {
          addDataPointsValues(
              returnType,
              sig,
              dataPointsMethod.getName(),
              list,
              dataPointsMethod.invokeExplosively(null));
        } catch (Throwable throwable) {
          DataPoints annotation = dataPointsMethod.getAnnotation(DataPoints.class);
          if (annotation != null
              && isAssignableToAnyOf(annotation.ignoredExceptions(), throwable)) {
            return;
          } else {
            throw throwable;
          }
        }
      }
    }
  }

  private void addDataPointsValues(
      Class<?> type,
      ParameterSignature sig,
      String name,
      List<PotentialAssignment> list,
      Object value) {
    throw new java.lang.Error();
  }

  private static boolean isAssignableToAnyOf(Class<?>[] typeArray, Object target) {
    throw new java.lang.Error();
  }

  protected Collection<FrameworkMethod> getDataPointsMethods(ParameterSignature sig) {
    throw new java.lang.Error();
  }
}

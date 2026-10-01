package org.junit.experimental.theories.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.runners.model.FrameworkMethod;

public class SpecificDataPointsSupplier extends AllMembersSupplier {

  protected Collection<FrameworkMethod> getDataPointsMethods(ParameterSignature sig) {
    Collection<FrameworkMethod> methods = super.getDataPointsMethods(sig);
    String requestedName = sig.getAnnotation(FromDataPoints.class).value();
    List<FrameworkMethod> methodsWithMatchingNames = new ArrayList<FrameworkMethod>();
    for (FrameworkMethod method : methods) {
      String[] methodNames = method.getAnnotation(DataPoints.class).value();
      if (Arrays.asList(methodNames).contains(requestedName)) {
        methodsWithMatchingNames.add(method);
      }
    }
    return methodsWithMatchingNames;
  }
}

package org.junit.experimental.theories.internal;

import java.util.Collection;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;
import org.junit.runners.model.FrameworkMethod;

public class AllMembersSupplier extends ParameterSupplier {

  protected Collection<FrameworkMethod> getSingleDataPointMethods(ParameterSignature sig) {
    throw new java.lang.Error();
  }
}

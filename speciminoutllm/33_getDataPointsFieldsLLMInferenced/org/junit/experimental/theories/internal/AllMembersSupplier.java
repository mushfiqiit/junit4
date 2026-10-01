package org.junit.experimental.theories.internal;

import java.lang.reflect.Field;
import java.util.Collection;
import org.junit.experimental.theories.ParameterSignature;
import org.junit.experimental.theories.ParameterSupplier;

public class AllMembersSupplier extends ParameterSupplier {

  protected Collection<Field> getDataPointsFields(ParameterSignature sig) {
    throw new java.lang.Error();
  }
}

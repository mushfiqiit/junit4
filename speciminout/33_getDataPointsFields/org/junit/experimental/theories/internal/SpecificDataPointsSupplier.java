package org.junit.experimental.theories.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.FromDataPoints;
import org.junit.experimental.theories.ParameterSignature;

public class SpecificDataPointsSupplier extends AllMembersSupplier {

  protected Collection<Field> getDataPointsFields(ParameterSignature sig) {
    Collection<Field> fields = super.getDataPointsFields(sig);
    String requestedName = sig.getAnnotation(FromDataPoints.class).value();
    List<Field> fieldsWithMatchingNames = new ArrayList<Field>();
    for (Field field : fields) {
      String[] fieldNames = field.getAnnotation(DataPoints.class).value();
      if (Arrays.asList(fieldNames).contains(requestedName)) {
        fieldsWithMatchingNames.add(field);
      }
    }
    return fieldsWithMatchingNames;
  }
}

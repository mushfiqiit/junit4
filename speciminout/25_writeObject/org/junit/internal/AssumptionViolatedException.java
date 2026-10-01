package org.junit.internal;

import java.io.IOException;
import java.io.ObjectOutputStream;
import javax.annotation.Nullable;
import org.hamcrest.Matcher;
import org.hamcrest.SelfDescribing;

public class AssumptionViolatedException extends RuntimeException implements SelfDescribing {

  @Nullable private final String fAssumption;

  private final boolean fValueMatcher = false;

  @Nullable private final Object fValue;

  @Nullable private final Matcher<?> fMatcher;

  private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
    ObjectOutputStream.PutField putField = objectOutputStream.putFields();
    putField.put("fAssumption", fAssumption);
    putField.put("fValueMatcher", fValueMatcher);
    putField.put("fMatcher", SerializableMatcherDescription.asSerializableMatcher(fMatcher));
    putField.put("fValue", SerializableValueDescription.asSerializableValue(fValue));
    objectOutputStream.writeFields();
  }
}

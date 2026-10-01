package org.junit.internal;

import java.io.Serializable;
import javax.annotation.Nullable;

class SerializableValueDescription implements Serializable {

  static Object asSerializableValue(@Nullable Object value) {
    throw new java.lang.Error();
  }
}

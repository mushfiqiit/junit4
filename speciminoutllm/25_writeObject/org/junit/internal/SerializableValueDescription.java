package org.junit.internal;

import java.io.Serializable;

class SerializableValueDescription implements Serializable {

  static Object asSerializableValue(Object value) {
    throw new java.lang.Error();
  }
}

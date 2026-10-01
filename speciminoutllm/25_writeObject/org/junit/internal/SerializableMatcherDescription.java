package org.junit.internal;

import java.io.Serializable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Matcher;

class SerializableMatcherDescription<T> extends BaseMatcher<T> implements Serializable {

  static <T> Matcher<T> asSerializableMatcher(Matcher<T> matcher) {
    throw new java.lang.Error();
  }
}

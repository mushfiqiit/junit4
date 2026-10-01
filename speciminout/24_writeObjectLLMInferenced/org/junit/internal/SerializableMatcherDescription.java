package org.junit.internal;

import java.io.Serializable;
import javax.annotation.Nullable;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Matcher;

class SerializableMatcherDescription<T> extends BaseMatcher<T> implements Serializable {

  static <T> @Nullable Matcher<T> asSerializableMatcher(@Nullable Matcher<T> matcher) {
    throw new java.lang.Error();
  }
}

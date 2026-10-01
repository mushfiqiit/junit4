package org.junit.runner;

import java.io.Serializable;
import javax.annotation.Nullable;

public class Result implements Serializable {

  @Nullable private SerializedForm serializedForm;

  private Result(SerializedForm serializedForm) {
    throw new java.lang.Error();
  }

  private Object readResolve() {
    return new Result(serializedForm);
  }

  private static class SerializedForm implements Serializable {}
}

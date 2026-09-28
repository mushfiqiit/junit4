package org.junit.experimental.theories;

public abstract class PotentialAssignment {

  public static class CouldNotGenerateValueException extends Exception {

    public CouldNotGenerateValueException(Throwable e) {
      throw new java.lang.Error();
    }
  }

  public abstract Object getValue() throws CouldNotGenerateValueException;
}

package junit.extensions;

import junit.framework.Assert;
import junit.framework.Test;

@SuppressWarnings("deprecation")
public class TestDecorator extends Assert implements Test {

  public Test getTest() {
    throw new java.lang.Error();
  }
}

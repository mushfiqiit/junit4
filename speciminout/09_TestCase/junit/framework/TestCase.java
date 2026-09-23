package junit.framework;

@SuppressWarnings("deprecation")
public abstract class TestCase extends Assert implements Test {

  private String fName;

  public TestCase() {
    fName = null;
  }
}

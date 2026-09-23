package junit.runner;

import junit.framework.TestListener;

public abstract class BaseTestRunner implements TestListener {

  static boolean fgFilterStack;

  protected String processArguments(String[] args) {
    String suiteName = null;
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-noloading")) {
        setLoading(false);
      } else if (args[i].equals("-nofilterstack")) {
        fgFilterStack = false;
      } else if (args[i].equals("-c")) {
        if (args.length > i + 1) {
          suiteName = extractClassName(args[i + 1]);
        } else {
          System.out.println("Missing Test class name");
        }
        i++;
      } else {
        suiteName = args[i];
      }
    }
    return suiteName;
  }

  public void setLoading(boolean enable) {
    throw new java.lang.Error();
  }

  public String extractClassName(String className) {
    throw new java.lang.Error();
  }
}

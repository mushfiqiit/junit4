package junit.runner;

import java.util.Properties;
import javax.annotation.Nullable;
import junit.framework.TestListener;

public abstract class BaseTestRunner implements TestListener {

  @Nullable
  private static Properties fPreferences;
}

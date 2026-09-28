package org.junit.internal.management;

import javax.annotation.Nullable;
import org.junit.internal.Classes;

public class ManagementFactory {

  private static final class FactoryHolder {

    private static final @Nullable Class<?> MANAGEMENT_FACTORY_CLASS;

    static {
      Class<?> managementFactoryClass = null;
      try {
        managementFactoryClass = Classes.getClass("java.lang.management.ManagementFactory");
      } catch (ClassNotFoundException e) {
      }
      MANAGEMENT_FACTORY_CLASS = managementFactoryClass;
    }
  }
}

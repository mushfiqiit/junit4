package org.junit.internal.management;

import java.lang.reflect.Method;
import org.junit.internal.Classes;

final class ReflectiveRuntimeMXBean implements RuntimeMXBean {

  private static final class Holder {

    private static final Method getInputArgumentsMethod;

    static {
      Method inputArguments = null;
      try {
        Class<?> threadMXBeanClass = Classes.getClass("java.lang.management.RuntimeMXBean");
        inputArguments = threadMXBeanClass.getMethod("getInputArguments");
      } catch (ClassNotFoundException e) {
      } catch (NoSuchMethodException e) {
      } catch (SecurityException e) {
      }
      getInputArgumentsMethod = inputArguments;
    }
  }
}

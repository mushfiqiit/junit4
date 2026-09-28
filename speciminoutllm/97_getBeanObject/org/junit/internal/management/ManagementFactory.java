package org.junit.internal.management;

import java.lang.reflect.InvocationTargetException;

public class ManagementFactory {

  private static final class FactoryHolder {

    private static final Class<?> MANAGEMENT_FACTORY_CLASS;

    static Object getBeanObject(String methodName) {
      if (MANAGEMENT_FACTORY_CLASS != null) {
        try {
          return MANAGEMENT_FACTORY_CLASS.getMethod(methodName).invoke(null);
        } catch (IllegalAccessException e) {
        } catch (IllegalArgumentException e) {
        } catch (InvocationTargetException e) {
        } catch (NoSuchMethodException e) {
        } catch (SecurityException e) {
        }
      }
      return null;
    }
  }
}

package org.junit.internal.management;

import java.lang.reflect.Method;
import javax.annotation.Nullable;
import org.junit.internal.Classes;

final class ReflectiveThreadMXBean implements ThreadMXBean {

  private static final class Holder {

    static final Method getThreadCpuTimeMethod;

    @Nullable static final Method isThreadCpuTimeSupportedMethod;

    static {
      Method threadCpuTime = null;
      Method threadCpuTimeSupported = null;
      try {
        Class<?> threadMXBeanClass = Classes.getClass("java.lang.management.ThreadMXBean");
        threadCpuTime = threadMXBeanClass.getMethod("getThreadCpuTime", long.class);
        threadCpuTimeSupported = threadMXBeanClass.getMethod("isThreadCpuTimeSupported");
      } catch (ClassNotFoundException e) {
      } catch (NoSuchMethodException e) {
      } catch (SecurityException e) {
      }
      getThreadCpuTimeMethod = threadCpuTime;
      isThreadCpuTimeSupportedMethod = threadCpuTimeSupported;
    }
  }
}

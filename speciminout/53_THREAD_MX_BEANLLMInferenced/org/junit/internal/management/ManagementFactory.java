package org.junit.internal.management;

import javax.annotation.Nullable;

public class ManagementFactory {

  private static final class FactoryHolder {

    @Nullable
    static Object getBeanObject(String methodName) {
      throw new java.lang.Error();
    }
  }

  private static final class ThreadHolder {

    private static final ThreadMXBean THREAD_MX_BEAN =
        getBean(FactoryHolder.getBeanObject("getThreadMXBean"));

    private static final ThreadMXBean getBean(@Nullable Object threadMxBean) {
      throw new java.lang.Error();
    }
  }
}

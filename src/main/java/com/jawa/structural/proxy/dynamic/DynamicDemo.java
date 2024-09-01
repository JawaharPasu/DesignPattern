package com.jawa.structural.proxy.dynamic;

import java.lang.reflect.Proxy;

public class DynamicDemo {

    /**
     * Utiity method to construct a dynamic proxy for logging
     * @param target -> for which the logging is required
     * @param itf -> the interface that we want to receive on the output
     * @return
     * @param <T>
     */
    @SuppressWarnings("unchecked")
    public static <T> T withLogging(T target, Class<T> itf) {
        return (T) Proxy.newProxyInstance(
               itf.getClassLoader(),
               new Class<?>[]{itf},
                new LoggingHandler(target)
        );
    }
}

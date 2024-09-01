package com.jawa.structural.proxy.protection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarProxyTest {
    @Test
    void test() {
        CarProxy carProxy = new CarProxy(new Driver(12));
        assertEquals("The Car can't be driven as the age of driver is less than 18"
                , carProxy.drive());
    }
}

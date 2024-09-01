package com.jawa.structural.proxy.dynamic;

import org.junit.jupiter.api.Test;

public class DynamicTest {

    @Test
    void test() {
        Person person = new Person();
        Human logged = DynamicDemo.withLogging(person, Human.class);
        logged.talk();
        logged.walk();
        logged.walk();
        System.out.println(logged);
    }
}

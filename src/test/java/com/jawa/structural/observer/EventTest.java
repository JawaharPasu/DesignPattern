package com.jawa.structural.observer;

import org.junit.jupiter.api.Test;

public class EventTest {
    @Test
    void test() {
        Person person = new Person();

        Event<PropertyChangedEventArgs>.Subscription subscription = person.propertyChanged.addHandler(x -> {
            System.out.println("Person's property " + x.propertyName + " has changed");
        });

        person.setAge(17);
        person.setAge(18);
        subscription.close();
        person.setAge(19);
    }
}

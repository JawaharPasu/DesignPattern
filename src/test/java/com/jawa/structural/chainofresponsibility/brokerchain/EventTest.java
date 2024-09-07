package com.jawa.structural.chainofresponsibility.brokerchain;

import org.junit.jupiter.api.Test;

public class EventTest {
    @Test
    void test() {
        Event<String> event = new Event<>();
        int index = event.subscribe((element) -> System.out.println(element));
        System.out.println(index);
    }
}

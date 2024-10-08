package com.jawa.structural.chainofresponsibility.brokerchain;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<Args> {

    private int index=0;
    private Map<Integer, Consumer<Args>> handlers = new HashMap<>();

    public int subscribe(Consumer<Args> handler) {
        handlers.put(index, handler);
        return index++;
    }

    public void unsubscribe(int key){
        handlers.remove(key);
    }

    public void fire(Args args) {
        for (Consumer<Args> handler: handlers.values()) {
            handler.accept(args);
        }
    }
}

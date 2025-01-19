package com.jawa.behavioral.observer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class Event<TArgs> {

    private int count=0;
    private Map<Integer, Consumer<TArgs>> handlers = new HashMap<>();

    public Subscription addHandler(Consumer<TArgs> handler) {
        this.handlers.put(count, handler);
        Subscription subscription = new Subscription(this, count);
        ++count;
        return subscription;
    }

    public void fire(TArgs args) {
        for (Consumer<TArgs> handler: handlers.values()) {
            handler.accept(args);
        }
    }

    public class Subscription implements AutoCloseable {
        private Event<TArgs> event;
        private int id;

        public Subscription(Event<TArgs> event, int id) {
            this.event = event;
            this.id = id;
        }

        @Override
        public void close() {
            event.handlers.remove(id);
        }
    }
}

package com.jawa.creational.multiton;

import java.util.HashMap;

public class Printer {

    private static int counter = 0;

    private Printer () {
        counter++;
        System.out.println("This is the instance : " + counter);
    }

    private static HashMap<Subsystem, Printer> instances = new HashMap<>();

    public static Printer getInstance(Subsystem subsystem) {
        if (instances.containsKey(subsystem)) {
            return instances.get(subsystem);
        } else {
            Printer instance  = new Printer();
            instances.put(subsystem, instance);
            return instance;
        }
    }
}

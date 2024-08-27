package com.jawa.creational.singleton;

import java.io.File;
import java.io.IOException;

/**
 * The type Static block singleton.
 * in case if the constructor throws any exception,
 * then it has to be handled within the static block
 */
public class StaticBlockSingleton {
    private int value;

    private StaticBlockSingleton () throws IOException {
        File.createTempFile(".",".");
    }

    private static StaticBlockSingleton singleton;

    static {
        try {
            singleton = new StaticBlockSingleton();
        } catch (Exception ex) {
            System.out.println("Error occurred");
        }
    }

    public int getValue() {
        return value;
    }

    public static StaticBlockSingleton getSingleton () {
        return singleton;
    }
}

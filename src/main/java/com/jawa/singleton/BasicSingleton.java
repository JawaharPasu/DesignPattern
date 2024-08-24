package com.jawa.singleton;

/**
 * The type Basic singleton.
 * We are not allowing other classes to create new instances of the class
 * through public constructor. We create the instance inside the class itself
 * and share it when others need it
 */
public class BasicSingleton {

    private int value = 0;

    private BasicSingleton(){};

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance() {
        return INSTANCE;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

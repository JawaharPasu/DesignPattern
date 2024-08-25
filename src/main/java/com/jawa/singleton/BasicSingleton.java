package com.jawa.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * The type Basic singleton.
 * We are not allowing other classes to create new instances of the class
 * through public constructor. We create the instance inside the class itself
 * and share it when others need it
 */
public class BasicSingleton implements Serializable {

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

    /**
     * Read resolve object. This is from Serializabale,
     * as whenever the object is deserialised from file system/ network
     * it calls this method to return the object to keep the singleton functionality
     * If the class doesnt implement this, then object no longer exist as singleton
     *
     * @return the object
     */
    @Serial
    protected Object readResolve() {
        return INSTANCE;
    }
}

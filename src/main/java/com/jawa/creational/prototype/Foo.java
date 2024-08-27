package com.jawa.creational.prototype;

import java.io.Serializable;

public class Foo implements Serializable {
    private int number;
    private String something;

    public Foo(int number, String something) {
        this.number = number;
        this.something = something;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "number=" + number +
                ", something='" + something + '\'' +
                '}';
    }
}

package com.jawa.structural.decorator.staticdecomposition;

public class Circle implements Shape {

    private int size;

    public Circle() {
    }

    public Circle(int size) {
        this.size = size;
    }

    @Override
    public String info() {
        return "The circle is of size " + this.size;
    }
}

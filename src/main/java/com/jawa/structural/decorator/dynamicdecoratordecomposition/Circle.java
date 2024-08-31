package com.jawa.structural.decorator.dynamicdecoratordecomposition;

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

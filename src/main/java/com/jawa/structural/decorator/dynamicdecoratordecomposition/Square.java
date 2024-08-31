package com.jawa.structural.decorator.dynamicdecoratordecomposition;

public class Square implements Shape {

    private int size;

    public Square() {
    }

    public Square(int size) {
        this.size = size;
    }

    @Override
    public String info() {
        return "The circle is of size " + this.size;
    }
}

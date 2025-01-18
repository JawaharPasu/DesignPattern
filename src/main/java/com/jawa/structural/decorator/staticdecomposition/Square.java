package com.jawa.structural.decorator.staticdecomposition;

public class Square implements Shape {

    private int size;

    public Square() {
    }

    public Square(int size) {
        this.size = size;
    }

    @Override
    public String info() {
        return "The square is of size " + this.size;
    }
}

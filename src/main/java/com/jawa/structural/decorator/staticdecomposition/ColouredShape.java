package com.jawa.structural.decorator.staticdecomposition;

import java.util.function.Supplier;

public class ColouredShape<T extends Shape> implements Shape {

    private Shape shape;
    private String color;

    public ColouredShape(Supplier<? extends Shape> constructor,
                         String color) {
        this.shape = constructor.get();
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " has the color " + color;
    }
}

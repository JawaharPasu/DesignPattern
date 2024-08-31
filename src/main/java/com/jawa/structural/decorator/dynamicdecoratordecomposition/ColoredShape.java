package com.jawa.structural.decorator.dynamicdecoratordecomposition;

public class ColoredShape implements Shape {

    private Shape shape;
    private String color;

    public ColoredShape(Shape shape, String color) {
        this.shape = shape;
        this.color = color;
    }

    @Override
    public String info() {
        return shape.info() + " is of color " + this.color;
    }
}

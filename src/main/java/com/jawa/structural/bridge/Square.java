package com.jawa.structural.bridge;

public class Square extends Shape {

    public Square(Renderer Renderer) {
        super(Renderer);
    }

    @Override
    public String getName() {
        return "Square";
    }
}

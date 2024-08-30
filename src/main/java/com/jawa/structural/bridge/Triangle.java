package com.jawa.structural.bridge;

public class Triangle extends Shape {

    public Triangle(Renderer Renderer) {
        super(Renderer);
    }

    @Override
    public String getName() {
        return "Triangle";
    }
}

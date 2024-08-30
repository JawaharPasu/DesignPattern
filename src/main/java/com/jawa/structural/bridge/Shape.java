package com.jawa.structural.bridge;

public abstract class Shape {

    private Renderer renderer;

    public Shape(Renderer renderer) {
        this.renderer = renderer;
    }

    public abstract String getName();

    @Override
    public String toString() {
        return String.format("Drawing %s as %s", this.getName(), this.renderer.whatToRenderAs());
    }
}

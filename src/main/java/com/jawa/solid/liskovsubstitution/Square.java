package com.jawa.solid.liskovsubstitution;

public class Square extends Rectangle{

    public Square() {}

    public Square(int size) {
        width = height = size;
    }

    // here we are violating the Liskov substitution principle
    @Override
    public void setWidth(int width) {
        super.setWidth(width);
        super.setHeight(width);
    }

    @Override
    public void setHeight(int height) {
        super.setHeight(height);
        super.setWidth(height);
    }
}

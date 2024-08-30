package com.jawa.structural.adapter;

public class SquareToRectangleAdapter implements Rectangle {
    Square square;

    public SquareToRectangleAdapter(Square square) {
        this.square = square;

    }

    public int getHeight() {
        return this.square.side;
    }

    public int getWidth() {
        return this.square.side;
    }
}

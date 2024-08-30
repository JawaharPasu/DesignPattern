package com.jawa.structural.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdapterTest {

    @Test
    void test(){
        Square square = new Square(20);
        SquareToRectangleAdapter squareToRectangleAdapter = new SquareToRectangleAdapter(square);
        assertEquals(400, squareToRectangleAdapter.getArea());
    }
}

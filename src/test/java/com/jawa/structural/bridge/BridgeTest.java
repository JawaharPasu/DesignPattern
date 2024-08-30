package com.jawa.structural.bridge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BridgeTest {

    @Test
    void test() {
        assertEquals("Drawing Triangle as pixels", (new Triangle(new RasterRenderer())).toString());
        assertEquals("Drawing Square as lines", new Square(new VectorRenderer()).toString());
    }
}

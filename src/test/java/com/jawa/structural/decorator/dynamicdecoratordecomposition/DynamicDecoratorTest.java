package com.jawa.structural.decorator.dynamicdecoratordecomposition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DynamicDecoratorTest {

    @Test
    void test() {
        ColoredShape blue = new ColoredShape(new Square(30), "blue");
        assertEquals("The circle is of size 30 is of color blue",(blue.info()));

        TransparentShape trShape = new TransparentShape(
                new ColoredShape(
                        new Circle(20), "green"
                ), 50
        );
        assertEquals("The circle is of size 20 is of color green is of transparency 50",trShape.info());
    }
}

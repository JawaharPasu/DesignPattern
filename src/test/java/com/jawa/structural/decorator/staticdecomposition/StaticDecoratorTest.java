package com.jawa.structural.decorator.staticdecomposition;

import org.junit.jupiter.api.Test;

public class StaticDecoratorTest {

    @Test
    public void test() {
        ColouredShape<Square> colouredShape = new ColouredShape<>(
                () -> new Square(20),
                "blue"
        );
        System.out.println(colouredShape.info());
    }
}

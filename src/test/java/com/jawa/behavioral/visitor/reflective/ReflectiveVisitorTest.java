package com.jawa.behavioral.visitor.reflective;

import org.junit.jupiter.api.Test;

public class ReflectiveVisitorTest {

    @Test
    public void test() {
        AdditionExpression additionExpression = new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(new DoubleExpression(2), new DoubleExpression(5))
        );

        StringBuilder sb = new StringBuilder();
        ExpressionPrinter.print(additionExpression, sb);
        System.out.println(sb);
    }
}

package com.jawa.behavioral.visitor.classic;

import org.junit.jupiter.api.Test;

public class DoubleDispatchTest {

    @Test
    public void test() {
        AdditionExpression additionExpression = new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(new DoubleExpression(2), new DoubleExpression(5))
        );

        ExpressionPrinter expressionPrinter = new ExpressionPrinter();
        expressionPrinter.visit(additionExpression);
        System.out.println(expressionPrinter);

        ExpressionEvaluator ev = new ExpressionEvaluator();
        ev.visit(additionExpression);
        System.out.println(ev);
    }
}

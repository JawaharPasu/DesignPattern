package com.jawa.behavioral.visitor.acyclicvisitor;

import org.junit.jupiter.api.Test;

public class AcyclicVisitorTest {

    @Test
    public void test() {
        AdditionExpression additionExpression = new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(new DoubleExpression(2), new DoubleExpression(5))
        );

        ExpressionPrinter ep = new ExpressionPrinter();
        ep.visit(additionExpression);
        System.out.println(ep);
    }
}

package com.jawa.behavioral.visitor.intrusive;

import org.junit.jupiter.api.Test;

public class IntrusiveVisitorTest {

    @Test
    public void test() {
        AdditionExpression additionExpression = new AdditionExpression(new DoubleExpression(1),
                new AdditionExpression(new DoubleExpression(2), new DoubleExpression(5))
        );

        StringBuilder sb = new StringBuilder();
        additionExpression.print(sb);
        System.out.println(sb);
    }
}

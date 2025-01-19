package com.jawa.behavioral.visitor.classic;

public interface ExpressionVisitor {
    void visit(DoubleExpression e);
    void visit(AdditionExpression e);
}

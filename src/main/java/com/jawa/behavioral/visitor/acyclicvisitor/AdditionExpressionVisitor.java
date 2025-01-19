package com.jawa.behavioral.visitor.acyclicvisitor;

public interface AdditionExpressionVisitor extends Visitor{
    void visit(AdditionExpression obj);
}

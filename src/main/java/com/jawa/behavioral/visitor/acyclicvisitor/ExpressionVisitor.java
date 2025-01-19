package com.jawa.behavioral.visitor.acyclicvisitor;

public interface ExpressionVisitor extends Visitor{

    void visit(Expression obj);
}

package com.jawa.behavioral.visitor.acyclicvisitor;

public abstract class Expression {

    public void accept(Visitor visitor) {
        if (visitor instanceof ExpressionVisitor ev) {
            ev.visit(this);
        }
    }
}

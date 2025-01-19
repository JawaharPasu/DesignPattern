package com.jawa.behavioral.visitor.classic;

public abstract class Expression {

    public abstract void accept(ExpressionVisitor visitor);

}

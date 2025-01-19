package com.jawa.behavioral.visitor.acyclicvisitor;

public class AdditionExpression extends Expression {

    private Expression left, right;

    public AdditionExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRight() {
        return right;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof AdditionExpressionVisitor ev) {
            ev.visit(this);
        }
    }
}

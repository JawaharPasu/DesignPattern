package com.jawa.behavioral.visitor.acyclicvisitor;

public class DoubleExpression extends Expression {

    private double value;

    public DoubleExpression(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void accept(Visitor visitor) {
        if (visitor instanceof DoubleExpressionVisitor ev) {
            ev.visit(this);
        }
    }
}

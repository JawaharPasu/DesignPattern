package com.jawa.behavioral.visitor.classic;

public class ExpressionEvaluator implements ExpressionVisitor{

    private double result = 0;

    @Override
    public void visit(DoubleExpression e) {
        result = e.getValue();
    }

    @Override
    public void visit(AdditionExpression e) {
        e.getLeft().accept(this);
        double a = result;
        e.getRight().accept(this);
        double b = result;
        result = a+b;
    }

    @Override
    public String toString() {
        return "ExpressionEvaluator{" +
                "result=" + result +
                '}';
    }
}

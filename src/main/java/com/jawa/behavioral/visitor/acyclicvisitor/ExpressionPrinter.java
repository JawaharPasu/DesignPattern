package com.jawa.behavioral.visitor.acyclicvisitor;

public class ExpressionPrinter implements DoubleExpressionVisitor, AdditionExpressionVisitor {
    private StringBuilder sb = new StringBuilder();
    @Override
    public void visit(DoubleExpression e) {
        sb.append(e.getValue());
    }

    @Override
    public void visit(AdditionExpression e) {
        sb.append("(");
        e.getLeft().accept(this);
        sb.append("+");
        e.getRight().accept(this);
        sb.append(")");
    }

    @Override
    public String toString() {
        return sb.toString();
    }
}

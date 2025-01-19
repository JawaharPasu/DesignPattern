package com.jawa.behavioral.visitor.reflective;

public class ExpressionPrinter {

    public static void print(Expression e, StringBuilder sb) {
        if (e instanceof DoubleExpression de) {
            sb.append(de.getValue());
        } else if(e instanceof AdditionExpression ae) {
            sb.append("(");
            print(ae.getLeft(), sb);
            sb.append("+");
            print(ae.getRight(), sb);
            sb.append(")");
        }
    }
}

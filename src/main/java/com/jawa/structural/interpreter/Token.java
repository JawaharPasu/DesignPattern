package com.jawa.structural.interpreter;

public class Token {
    public enum Type{
        INTEGER,
        PLUS,
        MINUS,
        LPAREM,
        RPARAM
    }

    public Type type;
    public String text;

    public Token(Type type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        return "'" + text + "'";
    }
}

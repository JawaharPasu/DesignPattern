package com.jawa.structural.interpreter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TokenParser {

    static List<Token> lex(String input) {
        ArrayList<Token> result = new ArrayList<>();
        for(int i=0; i<input.length(); i++) {
            switch (input.charAt(i)) {
                case '+' ->
                    result.add(new Token(Token.Type.PLUS, "+"));
                case '-' ->
                    result.add(new Token(Token.Type.MINUS, "-"));
                case '(' ->
                    result.add(new Token(Token.Type.LPAREM, "("));
                case ')' ->
                    result.add(new Token(Token.Type.RPARAM, ")"));
                default -> {
                    StringBuilder sb = new StringBuilder(""+ input.charAt(i));
                    for(int j=i+1; j<input.length();j++) {
                        if (Character.isDigit(input.charAt(j))) {
                            sb.append(input.charAt(j));
                            i++;
                        } else {
                            result.add(new Token(Token.Type.INTEGER, sb.toString()));
                            break;
                        }
                    }
                }
            }
        }
        return result;
    }

    static Element parse(List<Token> tokens) {
        BinaryOperation result = new BinaryOperation();
        boolean haveLHS = false;

        for(int i=0; i< tokens.size(); i++) {
            Token token = tokens.get(i);
            switch (token.type) {
                case INTEGER -> {
                    Integer integer = new Integer(java.lang.Integer.parseInt(token.text));
                    if (!haveLHS) {
                        result.left = integer;
                        haveLHS = true;
                    } else
                        result.right = integer;
                }
                case PLUS -> {
                    result.type = BinaryOperation.Type.ADDITION;
                }
                case MINUS -> {
                    result.type = BinaryOperation.Type.SUBTRACTION;
                }
                case LPAREM -> {
                    int j=i;
                    for(; j< tokens.size(); j++) {
                        if (tokens.get(j).type == Token.Type.RPARAM) break;
                    }
                    List<Token> subexpression = tokens.stream()
                            .skip(i + 1)
                            .limit(j - i - 1)
                            .collect(Collectors.toList());
                    Element element = parse(subexpression);
                    if (!haveLHS) {
                        result.left = element;
                        haveLHS = true;
                    } else
                        result.right = element;
                    i = j;
                }
            }
        }
        return result;
    }
}

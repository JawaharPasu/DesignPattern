package com.jawa.structural.interpreter;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * when we get an input we need to convert that into an object-oriented structure
 * Interpreter pattern is used to do that
 */
public class TokenParserTest {
    @Test
    void test(){
        String input = "(12+4)-(13+1)";
        List<Token> tokens = TokenParser.lex(input);
        Element element = TokenParser.parse(tokens);
        //System.out.println(input + " = " + element.eval());
        assertEquals(2, element.eval());
        /*System.out.println(TokenParser.lex("(12+4)-(13+1)")
                .stream()
                .map(Token::toString)
                .collect(Collectors.joining("\t")));*/
    }
}

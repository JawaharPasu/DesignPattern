package com.jawa.structural.flyweight.capitalizeword;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SentenceTest {

    @Test
    void test() {
        Sentence sentence = new Sentence("<gamme[ build ]beta>");
        sentence.getWord(1).capitalize = true;
        assertEquals("<gamme[ BUILD ]beta>",sentence.toString());
    }
}

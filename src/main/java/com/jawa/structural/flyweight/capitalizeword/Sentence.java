package com.jawa.structural.flyweight.capitalizeword;

import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String plainText;
    private List<WordToken> tokens = new ArrayList<>();

    public Sentence(String plainText) {
        // todo
        String[] list = plainText.split(" ");
        for (int i = 0; i < list.length; i++) {
            tokens.add(new WordToken(list[i]));
        }
        //tokens = Arrays.stream(plainText.split(" "))
        // .map(i -> new WordToken(i)).collect(Collectors.toList());
    }

    public WordToken getWord(int index) {
        // todo
        return tokens.get(index);
    }

    @Override
    public String toString() {
        // todo
        StringBuilder sb = new StringBuilder();
        for (WordToken token : tokens) {
            sb.append(
                    token.capitalize == true ? token.word.toUpperCase() : token.word
            );
            sb.append(" ");
        }
        return sb.toString().trim();
    }

    class WordToken {
        public String word;
        public boolean capitalize;

        public WordToken(String word) {
            this.word = word;
            this.capitalize = false;
        }
    }
}

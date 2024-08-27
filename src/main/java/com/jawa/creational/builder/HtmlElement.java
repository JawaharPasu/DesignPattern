package com.jawa.creational.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HtmlElement {
    public String name, text;
    public List<HtmlElement> elements = new ArrayList<>();
    private final int indentSize = 2;
    private final String newLine = System.lineSeparator();

    public HtmlElement() {
    }

    public HtmlElement(String name, String text) {
        this.name = name;
        this.text = text;
    }

    public String toStringImpl(int indent) {
        StringBuilder stringBuilder = new StringBuilder();
        String i = String.join("", Collections.nCopies(indent*indentSize, " "));
        stringBuilder.append(String.format("%s<%s>%s", i, name, newLine));
        if (text!=null && !text.isEmpty()) {
            stringBuilder.append(String.join("", Collections.nCopies(indent*(indentSize+1), " ")))
                    .append(text)
                    .append(newLine);
        }

        for (HtmlElement e : elements) {
            stringBuilder.append(e.toStringImpl(indent+1));
        }

        stringBuilder.append(String.format("%s</%s>%s", i, name, newLine));
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return toStringImpl(0);
    }
}

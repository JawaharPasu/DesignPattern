package com.jawa.creational.builder;

import java.util.Collections;

public class CodeBuilder {
    StringBuilder sb = new StringBuilder();
    private final int indent = 1;
    private final String newLine = System.lineSeparator();
    String space = String.join("", Collections.nCopies(indent, " "));

    public CodeBuilder(String className)
    {

        sb.append("public class")
                .append(String.format("%s%s", space, className))
                .append(newLine)
                .append("{")
                .append(newLine);
    }

    public CodeBuilder addField(String name, String type)
    {
        String indentspce = String.join("", Collections.nCopies(2*indent, " "));
        sb.append(indentspce)
                .append("public")
                .append(String.format("%s%s%s%s", space, type, space, name))
                .append(";")
                .append(newLine);
        return this;
    }

    @Override
    public String toString()
    {
        sb.append("}");
        return sb.toString();
    }
}

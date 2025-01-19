package com.jawa.behavioral.strategy.dynamic;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DynamicStrategyTest {

    @Test
    public void testMarkdown() {
        TextProcessor processor = new TextProcessor(OutputFormat.MARKDOWN);
        processor.appendList(List.of("green", "blue", "red"));
        System.out.println(processor);

        processor.clear();
        System.out.println(processor);
    }

    @Test
    public void testHtml() {
        TextProcessor processor = new TextProcessor(OutputFormat.HTML);
        processor.appendList(List.of("green", "blue", "red"));
        System.out.println(processor);

        processor.clear();
        System.out.println(processor);
    }
}

package com.jawa.solid.singleresponsibility;

import java.util.ArrayList;
import java.util.List;

/*
 * The purpose of this class is to just store the entries as a journal
 * No other purpose this class should have
 */
public class Journal {
    private List<String> entries = new ArrayList<>();
    private static Integer count = 0;

    public void addEntry(String entry) {
        entries.add(" " + (++count) + ". " + entry);
    }

    public void removeEntry(Integer position) {
        entries.remove(position-1);
        count--;
    }

    @Override
    public String toString() {
        return String.join(System
                .lineSeparator(), entries);
    }
}

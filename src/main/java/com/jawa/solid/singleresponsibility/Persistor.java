package com.jawa.solid.singleresponsibility;

import java.io.*;
/*
* The purpose of this class is to persist the journal to a file
* */
public class Persistor {
    public void persist(Journal journal, String filename, boolean overwrite) throws FileNotFoundException {
        File file = new File(filename);
        if (overwrite || file.exists()) {
            try (PrintStream out = new PrintStream(file)){
                out.println(journal);
            }
        }
    }
}

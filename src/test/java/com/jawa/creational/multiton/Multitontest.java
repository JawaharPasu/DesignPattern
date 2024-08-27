package com.jawa.creational.multiton;

import com.jawa.creational.multiton.Printer;
import com.jawa.creational.multiton.Subsystem;
import org.junit.jupiter.api.Test;

public class Multitontest {

    @Test
    void test() {
        Printer printer1 = Printer.getInstance(Subsystem.NORMAL);
        Printer printer2 = Printer.getInstance(Subsystem.MODERATE);
        Printer printer3 = Printer.getInstance(Subsystem.MODERATE);
    }
}

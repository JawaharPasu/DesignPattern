package com.jawa.behavioral.state.classic;

import org.junit.jupiter.api.Test;

public class ClassicTest {

    @Test
    public void test() {
        LightSwitch ls = new LightSwitch();
        ls.on();
        ls.on();
        ls.off();
    }
}

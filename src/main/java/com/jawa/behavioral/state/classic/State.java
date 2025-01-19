package com.jawa.behavioral.state.classic;

public class State {

    void on(LightSwitch ls) {
        System.out.println("light is already on");
    }

    void off(LightSwitch ls) {
        System.out.println("light is already off");
    }


}

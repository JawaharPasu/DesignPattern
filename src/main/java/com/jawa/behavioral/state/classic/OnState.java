package com.jawa.behavioral.state.classic;

public class OnState extends State{

    public OnState() {
        System.out.println("Light turned on");
    }

    @Override
    void off(LightSwitch ls) {
        System.out.println("switching light off..");
        ls.setState(new OffState());
    }
}

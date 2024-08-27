package com.jawa.creational.factory;

public class Coffee implements HotDrink{
    @Override
    public void consume() {
        System.out.println("That was a tasty coffee");
    }
}

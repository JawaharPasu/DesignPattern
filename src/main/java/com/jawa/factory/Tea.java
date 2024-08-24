package com.jawa.factory;

public class Tea implements HotDrink{
    @Override
    public void consume() {
        System.out.println("That was a tasty tea");
    }
}

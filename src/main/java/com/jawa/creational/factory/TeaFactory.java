package com.jawa.creational.factory;

public class TeaFactory implements HotDrinkFactory{
    @Override
    public HotDrink prepare(String amount) {
        System.out.println("Put in the tea bad, pour " + amount + " of milk, enjoy!");
        return new Tea();
    }
}

package com.jawa.creational.factory;

public class CoffeeFactory implements HotDrinkFactory {
    public HotDrink prepare(String amount) {
        System.out.println("Grind some beans, pour " + amount + " of milk, enjoy!");
        return new Coffee();
    }
}

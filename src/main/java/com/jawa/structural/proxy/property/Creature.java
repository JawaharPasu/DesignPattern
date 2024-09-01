package com.jawa.structural.proxy.property;

/**
 * we are using Property to not directly assign value using = in the Creature class
 * If we use = then whenver a cahgne in the value jappens using = then we can't track it
 * to avoid = we use property so that we can track it.
 * Imagine we want to log every assignment for a value change.
 */
public class Creature {

    private Property<Integer> agility = new Property<>(10);

    public int getAgility() {
        return agility.getValue();
    }

    public void setAgility(int value) {
        this.agility.setValue(value);
    }
}

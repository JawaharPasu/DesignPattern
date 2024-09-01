package com.jawa.structural.proxy.protection;

public class Car {

    protected Driver driver;

    public Car(Driver driver) {
        this.driver = driver;
    }

    public String drive() {
        return "The car is driver by driver of age " + this.driver.getAge();
    }
}

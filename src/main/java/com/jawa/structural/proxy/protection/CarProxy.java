package com.jawa.structural.proxy.protection;

/**
 * This is a proxy class for Car class
 * we can have addtional changes to existing functionality
 */
public class CarProxy extends Car {
    public CarProxy(Driver driver) {
        super(driver);
    }

    @Override
    public String drive() {
        if (this.driver.getAge()>18) return super.drive();
        else return "The Car can't be driven as the age of driver is less than 18";
    }
}

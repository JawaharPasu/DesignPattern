package com.jawa.prototype;

/**
 * The type Address.
 */
public class Address {

    private String number, street;

    /**
     * Instantiates a new Address.
     *
     * @param number the number
     * @param street the street
     */
    public Address(String number, String street) {
        this.number = number;
        this.street = street;
    }

    /**
     * Instantiates a new Address by copying a given address.
     * This is the new prototype
     *
     * @param other the other
     */
    public Address(Address other) {
        this.number = other.number;
        this.street = other.street;
    }
}

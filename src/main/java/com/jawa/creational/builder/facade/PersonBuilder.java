package com.jawa.creational.builder.facade;

public class PersonBuilder {
    protected Person person = new Person();

    public PersonAddressBuilder lives() {
        return new PersonAddressBuilder(person);
    }

    public PersonEmploymentBuilder works() {
        return new PersonEmploymentBuilder(person);
    }

    public Person build() {
        return this.person;
    }
}

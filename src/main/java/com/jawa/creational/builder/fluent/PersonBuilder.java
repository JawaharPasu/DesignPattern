package com.jawa.creational.builder.fluent;

/*
* Any extending class also has to work, this class methods should work with extended classes methods
* so we use recursive generics to make this class methods work with extended classes*/
public class PersonBuilder<SELF extends PersonBuilder<SELF>> {
    protected Person person;

    public PersonBuilder() {
        this.person = new Person();
    }

    public SELF withName(String name) {
        this.person.name = name;
        return self();
    }

    public Person build() {
        return this.person;
    }

    protected SELF self(){
        return (SELF) this;
    }
}

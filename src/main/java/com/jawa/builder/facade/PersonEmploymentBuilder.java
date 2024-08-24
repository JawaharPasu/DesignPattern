package com.jawa.builder.facade;

public class PersonEmploymentBuilder extends PersonBuilder{

    public PersonEmploymentBuilder(Person person) {
        this.person = person;
    }

    public PersonEmploymentBuilder worksAt(String company) {
        this.person.companyName = company;
        return this;
    }

    public PersonEmploymentBuilder worksAs(String position) {
        this.person.position = position;
        return this;
    }

    public PersonEmploymentBuilder earns(int salary) {
        this.person.annualIncome = salary;
        return this;
    }
}

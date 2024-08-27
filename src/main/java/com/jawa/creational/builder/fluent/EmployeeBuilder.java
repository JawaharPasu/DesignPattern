package com.jawa.creational.builder.fluent;

/*we provide the employeeBuilder as type argument to the recursive generics*/
public class EmployeeBuilder extends PersonBuilder<EmployeeBuilder>{
    public EmployeeBuilder withEmployeePosition(String position) {
        this.person.position = position;
        return self();
    }

    @Override
    protected EmployeeBuilder self() {
        return this;
    }
}

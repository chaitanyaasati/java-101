package com.chaitanya.springcore.e1.sr_009_AutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    @Autowired
    private Address address1;

    public Employee() {
        System.out.println("I am Employee's default constructor");
    }

    public Employee(Address address1) {
        System.out.println("I am Employee's parameterized constructor initializing all instance variables");
        this.address1 = address1;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress(Address address1) {
        System.out.println("Setting adddress1");
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address1=" + address1 +
                '}';
    }
}

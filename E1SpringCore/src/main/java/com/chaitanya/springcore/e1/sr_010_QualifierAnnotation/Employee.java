package com.chaitanya.springcore.e1.sr_010_QualifierAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

    @Autowired
    @Qualifier("address2")
    private Address address1;

    public Employee() {
    }

    public Employee(Address address1) {
        System.out.println("Constructor used");
        this.address1 = address1;
    }

    public Address getAddress1() {
        return address1;
    }

    public void setAddress(Address address1) {
        System.out.println("setters used");
        this.address1 = address1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address1=" + address1 +
                '}';
    }
}

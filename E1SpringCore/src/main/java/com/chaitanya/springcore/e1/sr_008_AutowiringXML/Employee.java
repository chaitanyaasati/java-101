package com.chaitanya.springcore.e1.sr_008_AutowiringXML;

public class Employee {
    private Address address;

    public Employee() {
        System.out.println("I am Employee's default constructor");
    }

    public Employee(Address address) {
        System.out.println("I am Employee's parameterized constructor");
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        System.out.println("Setting address");
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }
}

package com.chaitanya.springcore.e1.sr_018_javaConfig;


public class Student {
    Address address;
    String name;

    public Student() {
        System.out.println("I am default constructor");
    }

    public Student(Address address, String name) {
        this.address = address;
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void tryMe(){
        System.out.println("I am method");
    }
}

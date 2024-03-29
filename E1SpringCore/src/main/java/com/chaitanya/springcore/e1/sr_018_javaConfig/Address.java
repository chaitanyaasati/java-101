package com.chaitanya.springcore.e1.sr_018_javaConfig;

//we have removed component annotation here
public class Address {
    String street;
    String city;

    public Address() {
        System.out.println("I am Address default constructor");
    }

    public Address(String street, String city) {
        System.out.println("I am Address parameterized constructor");
        this.street = street;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

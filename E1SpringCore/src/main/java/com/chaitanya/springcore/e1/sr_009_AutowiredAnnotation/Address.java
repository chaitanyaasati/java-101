package com.chaitanya.springcore.e1.sr_009_AutowiredAnnotation;

public class Address {
    private String street;
    private String city;

    public Address() {
        System.out.println("I am Address default constructor");
    }

    public void setStreet(String street) {
        System.out.println("Setting street");
        this.street = street;
    }

    public void setCity(String city) {
        System.out.println("Setting city");
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

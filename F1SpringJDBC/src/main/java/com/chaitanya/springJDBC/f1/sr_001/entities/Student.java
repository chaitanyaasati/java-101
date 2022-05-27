package com.chaitanya.springJDBC.f1.sr_001.entities;

public class Student {
    private int id;//this is equivalent to id in Student table in database
    private String name;//this is equivalent to name in Student table in database
    private String city;//this is equivalent to city in Student table database

    public Student(){

    }

    public Student(int id, String name, String city){
        this.id=id;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

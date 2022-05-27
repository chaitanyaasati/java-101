package com.chaitanya.springcore.e1.sr_017_componentScanAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Value("Lokesh")
    String name;

    public Student() {
        System.out.println("I am default constructor");
    }

    public Student(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public void tryMe(){
        System.out.println("I am method");
    }
}

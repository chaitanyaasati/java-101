package com.chaitanya.springcore.e1.sr_014_springBeanScope;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Scope("prototype")
public class Student {

    @Value("Lokesh")
    private String studentName;

    @Value("Indore")
    private String city;

    @Value("#{myBestFriends1}")
    private List<String> friends;

    public Student() {
        System.out.println("I am Student default constructor");
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }
}

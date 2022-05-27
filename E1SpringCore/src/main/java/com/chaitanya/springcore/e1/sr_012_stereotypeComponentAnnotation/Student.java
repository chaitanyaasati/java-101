package com.chaitanya.springcore.e1.sr_012_stereotypeComponentAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("student1")
public class Student {
    @Value("Chaitanya")
    private String studentName;
    @Value("Nagpur")
    private String city;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}

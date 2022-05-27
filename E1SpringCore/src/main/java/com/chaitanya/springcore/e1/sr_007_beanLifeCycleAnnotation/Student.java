package com.chaitanya.springcore.e1.sr_007_beanLifeCycleAnnotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student{
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student() {
        System.out.println("I am student's default constructor");
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        System.out.println("setting studentId");
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        System.out.println("setting studentName");
        this.studentName = studentName;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("setting studentAddress");
        this.studentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                '}';
    }

    //name of life cycle methods can be anything you want
    @PostConstruct
    public void start(){
        System.out.println("I am initilaizing annotation");
    }

    @PreDestroy
    public void end(){
        System.out.println("I am destroying annotation");
    }
}

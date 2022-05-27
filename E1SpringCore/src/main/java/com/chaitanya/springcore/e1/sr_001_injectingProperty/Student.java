package com.chaitanya.springcore.e1.sr_001_injectingProperty;

//this is Bean
public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student() {
        System.out.println("I am Student Default Constructor");
    }

    public Student(int studentId, String studentName, String studentAddress) {
        System.out.println("I am Student's parameterized constructor");
        System.out.println("I am initializing all student's object instance variables");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
    }

    public void setStudentId(int studentId) {
        System.out.println("Setting studentId");
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        System.out.println("Setting studentName");
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        System.out.println("Setting studentAddress");
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
}

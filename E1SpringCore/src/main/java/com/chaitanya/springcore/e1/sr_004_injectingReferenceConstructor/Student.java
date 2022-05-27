package com.chaitanya.springcore.e1.sr_004_injectingReferenceConstructor;

public class Student {
    private int studentId;
    private String studentAddress;
    private College college;

    public Student() {
        System.out.println("I am student's default constructor");
    }

    public Student(int studentId, String studentAddress, College college) {
        System.out.println("I am student's parameterized constructor");
        System.out.println("I am initializing student's object all instance variables");
        this.studentId = studentId;
        this.studentAddress = studentAddress;
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentAddress='" + studentAddress + '\'' +
                ", college=" + college +
                '}';
    }
}

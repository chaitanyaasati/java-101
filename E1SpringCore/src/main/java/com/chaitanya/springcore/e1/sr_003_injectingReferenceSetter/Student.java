package com.chaitanya.springcore.e1.sr_003_injectingReferenceSetter;

public class Student {
    private int studentId;
    private String studentName;
    private College college;

    public Student() {
        System.out.println("I am student's default constructor");
    }

    public Student(int studentId, String studentName, College college) {
        System.out.println("I am student's parameterized constructor");
        System.out.println("I am initializing student's object all instance variables");
        this.studentId = studentId;
        this.studentName = studentName;
        this.college = college;
    }

    public void setStudentId(int studentId) {
        System.out.println("I am setting studentId");
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        System.out.println("I am setting studentName");
        this.studentName = studentName;
    }

    public void setCollege(College college) {
        System.out.println("I am setting college instance variable");
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", college30=" + college +
                '}';
    }
}

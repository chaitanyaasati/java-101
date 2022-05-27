package com.chaitanya.springcore.e1.sr_002_injectingCollection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private int studentId;
    private String studentName;
    private String studentAddress;
    private List<String> studentSubjects;
    private Set<Integer> studentLuckyNumbers;
    private Map<String,Integer> studentMarks;

    public Student() {
        System.out.println("I am Student default constructor");
    }

    public Student(int studentId, String studentName, String studentAddress, List<String> studentSubjects, Set<Integer> studentLuckyNumbers, Map<String, Integer> studentMarks) {
        System.out.println("I am Student's parameterized constructor");
        System.out.println("I am initializing all student's object instance variables");
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentAddress = studentAddress;
        this.studentSubjects = studentSubjects;
        this.studentLuckyNumbers = studentLuckyNumbers;
        this.studentMarks = studentMarks;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAddress(String studentAddress) {
        this.studentAddress = studentAddress;
    }

    public void setStudentSubjects(List<String> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    public void setStudentLuckyNumbers(Set<Integer> studentLuckyNumbers) {
        this.studentLuckyNumbers = studentLuckyNumbers;
    }

    public void setStudentMarks(Map<String, Integer> studentMarks) {
        this.studentMarks = studentMarks;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentAddress='" + studentAddress + '\'' +
                ", studentSubjects=" + studentSubjects +
                ", studentLuckyNumbers=" + studentLuckyNumbers +
                ", studentMarks=" + studentMarks +
                '}';
    }
}

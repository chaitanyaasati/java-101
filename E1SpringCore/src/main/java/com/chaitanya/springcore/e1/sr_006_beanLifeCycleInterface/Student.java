package com.chaitanya.springcore.e1.sr_006_beanLifeCycleInterface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean {
    private int studentId;
    private String studentName;
    private String studentAddress;

    public Student() {
        System.out.println("I am Student's default constructor");
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

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("I am initialzing");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("I am getting destroyed");
    }
}

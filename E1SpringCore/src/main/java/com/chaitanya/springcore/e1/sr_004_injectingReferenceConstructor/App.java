package com.chaitanya.springcore.e1.sr_004_injectingReferenceConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_004/config.xml");
        Student student1 = (Student)context.getBean("student1");
        Student student2 = (Student)context.getBean("student2");
        Student student3 = (Student)context.getBean("student3");
        College college1 = (College)context.getBean("college1");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(college1);
    }
}

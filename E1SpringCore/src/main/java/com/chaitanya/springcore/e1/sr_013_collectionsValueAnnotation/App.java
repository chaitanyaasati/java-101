package com.chaitanya.springcore.e1.sr_013_collectionsValueAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_013/config.xml");
        Student student = context.getBean("student1",Student.class);
        System.out.println(student);
        System.out.println(student.getAddresses().getClass().getName());
    }
}

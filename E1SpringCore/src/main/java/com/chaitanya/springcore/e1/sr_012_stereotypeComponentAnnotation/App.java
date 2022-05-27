package com.chaitanya.springcore.e1.sr_012_stereotypeComponentAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_012/config.xml");
        Student student = context.getBean("student1",Student.class);
        System.out.println(student);
    }
}

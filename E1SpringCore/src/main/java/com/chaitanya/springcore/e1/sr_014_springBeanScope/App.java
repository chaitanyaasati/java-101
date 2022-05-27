package com.chaitanya.springcore.e1.sr_014_springBeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_014/config.xml");
        Student student1 = context.getBean(Student.class);
        Student student2 = context.getBean(Student.class);
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}

package com.chaitanya.springcore.e1.sr_002_injectingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_002/config.xml");
        Student s1 = (Student)context.getBean("student1");
        System.out.println(s1);
    }
}

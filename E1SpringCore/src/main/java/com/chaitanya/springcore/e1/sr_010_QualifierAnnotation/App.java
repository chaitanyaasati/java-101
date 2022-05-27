package com.chaitanya.springcore.e1.sr_010_QualifierAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_010/config.xml");
        Employee e1 = context.getBean("emp1", Employee.class);
        System.out.println("e1: "+e1);
    }
}

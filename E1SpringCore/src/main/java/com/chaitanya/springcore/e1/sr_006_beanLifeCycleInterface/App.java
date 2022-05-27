package com.chaitanya.springcore.e1.sr_006_beanLifeCycleInterface;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_006/config.xml");
        Student s1 = (Student)context.getBean("student1");
        context.registerShutdownHook();
        System.out.println(s1);
    }
}

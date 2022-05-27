package com.chaitanya.springcore.e1.sr_011_standAloneCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_011/config.xml");
        Person person1 = context.getBean("person1", Person.class);
        Person person2 = context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1.getFriends().getClass().getName());
    }
}

package com.chaitanya.springcore.e1.sr_016_invokeStaticVariableUsingSpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.chaitanya.springcore.e1.sr_016/config.xml");
        Square sq1 = context.getBean(Square.class);
        System.out.println(sq1);
    }
}

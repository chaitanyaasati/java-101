package com.chaitanya.springcore.e1.sr_018_javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student s = context.getBean( "getStudent", Student.class);
        Student s3 = context.getBean( "getStudent", Student.class);
        System.out.println(s.hashCode());
        System.out.println(s3.hashCode());
        Student s1 = context.getBean("myname", Student.class);
        System.out.println("Student obj");
    }
}

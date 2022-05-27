package com.chaitanya.springcore.e1.sr_017_componentScanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student s1 = context.getBean(Student.class);
        System.out.println(s1);
        System.out.println("Student obj");
    }
}

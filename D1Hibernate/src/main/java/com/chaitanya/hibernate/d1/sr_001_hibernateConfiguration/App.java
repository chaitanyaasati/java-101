package com.chaitanya.hibernate.d1.sr_001_hibernateConfiguration;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_001/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        System.out.println(factory);
        System.out.println(factory.isClosed());
    }
}

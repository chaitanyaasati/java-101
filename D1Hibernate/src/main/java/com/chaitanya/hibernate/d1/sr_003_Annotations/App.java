package com.chaitanya.hibernate.d1.sr_003_Annotations;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class App {
    public static void main(String[] args) throws IOException {
        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_003/hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        Student s1 = new Student();
        s1.setId(134);
        s1.setCity("Chennai");
        s1.setName("Abhishek");
        System.out.println(s1);
        Address ad1 = new Address();
        ad1.setStreet("london street");
        ad1.setAddedDate(new Date());
        ad1.setOpen(true);
        ad1.setCity("Barcelona");
        ad1.setX(345.53);
        System.out.println(ad1);
        FileInputStream fs = new FileInputStream("/Users/chaitanya/Desktop/copy.png");
        byte[] data = new byte[fs.available()];
        fs.read(data);
        ad1.setImage(data);
        Session session = factory.openSession();
        session.beginTransaction();
        session.persist(s1);
        session.persist(ad1);
        session.getTransaction().commit();
        Student s2 = session.get(Student.class,234);
        Address ad2 = session.load(Address.class, 1);
        System.out.println(s2);
        System.out.println(ad2);
        session.close();
        System.out.println("Done..");
    }
}


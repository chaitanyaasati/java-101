package com.chaitanya.hibernate.d1.sr_004_Embeddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_004/hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Student s1 = new Student();
        s1.setCity("Nagpur");
        s1.setId(123);
        s1.setName("Vinayak");
        Certificate certi = new Certificate();
        certi.setCourse("Computer Science");
        certi.setDuration("2 Months");
        s1.setCertificate(certi);
        //sessionFactory.openSession();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(s1);
        session.getTransaction().commit();
        sessionFactory.close();
    }
}

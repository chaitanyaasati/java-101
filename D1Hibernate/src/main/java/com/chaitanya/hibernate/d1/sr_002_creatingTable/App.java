package com.chaitanya.hibernate.d1.sr_002_creatingTable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {
        Student s1 = new Student();
        s1.setId(23796);
        s1.setCity("Denmark");
        s1.setName("Vizak");
        System.out.println(s1);
        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_002/hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        sessionFactory.openSession(); //this method creates a session and returns it
        Session session = sessionFactory.getCurrentSession(); // this method returns current open session
        Transaction transaction = session.beginTransaction();
        //session.beginTransaction();
        //session.save(s1); It is deprecated
        session.persist(s1);
        transaction.commit();
        //session.getTransaction().commit();
        session.close();
    }
}

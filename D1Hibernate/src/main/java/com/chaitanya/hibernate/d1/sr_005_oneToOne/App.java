package com.chaitanya.hibernate.d1.sr_005_oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Answer a1 = new Answer();
        a1.setAnswer("My name is Chaitanya");
        a1.setId(234);
        Question q1 = new Question();
        q1.setAnswer(a1);
        q1.setId(778);
        q1.setQuestion("What is your name");
        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_005/hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(a1);
        session.persist(q1);
        transaction.commit();
        session.close();
    }
}

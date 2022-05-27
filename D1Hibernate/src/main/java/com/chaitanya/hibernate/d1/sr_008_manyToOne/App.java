package com.chaitanya.hibernate.d1.sr_008_manyToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        //creating question
        Question q1 = new Question();
        q1.setId(1);
        q1.setQuestion("What is your name");

        //creating question
        Question q2 = new Question();
        q2.setId(2);
        q2.setQuestion("What is java");

        //creating answer
        Answer a1 = new Answer();
        a1.setAnswer("My name is Chaitanya");
        a1.setId(11);

        //creating answer
        Answer a2 = new Answer();
        a2.setAnswer("My name is peace and");
        a2.setId(22);

        //creating answer
        Answer a3 = new Answer();
        a3.setAnswer("My name is fire");
        a3.setId(33);


        a1.setQuestion(q1);
        a2.setQuestion(q2);
        a3.setQuestion(q1);


        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_008/hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(q1);
        session.persist(q2);
        session.persist(a1);
        session.persist(a2);
        session.persist(a3);
        transaction.commit();
        session.close();
    }
}

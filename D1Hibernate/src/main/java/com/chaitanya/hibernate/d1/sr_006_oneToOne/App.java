package com.chaitanya.hibernate.d1.sr_006_oneToOne;

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
        a1.setId(1);

        //creating answer
        Answer a2 = new Answer();
        a2.setAnswer("Java is programming lanaguage");
        a2.setId(2);

        a1.setQuestion(q2);
        q1.setAnswer(a1);
        a2.setQuestion(q1);
        q2.setAnswer(a2);

        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_006/hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(q1);
        session.persist(q2);
        session.persist(a1);
        session.persist(a2);
        transaction.commit();
        Question q5 = session.get(Question.class,1);
        System.out.println(q5.getId()+" "+q5.getQuestion()+" "+ q5.getAnswer().getAnswer());
        Answer a4 = session.get(Answer.class, 1);
        System.out.println(a4.getAnswer() +"xx i am mee xx "+ a4.getQuestion());
        session.close();
    }
}

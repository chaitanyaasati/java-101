package com.chaitanya.hibernate.d1.sr_011_manyToManyMappedBy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        //creating question
        Project p1 = new Project(1, "pehlaProject", null);
        Project p2 = new Project(2, "dusraProject", null);
        Project p3 = new Project(3, "teesraProject", null);
        
        Emp e1 = new Emp(1,"Abhishek",null);
        Emp e2 = new Emp(2,"Rajat", null);
        Emp e3 = new Emp(3,"Vinay",null);

        List<Emp> p1Emps = new ArrayList<>();
        p1Emps.add(e1);
        p1Emps.add(e2);

        List<Emp> p2Emps = new ArrayList<>();
        p2Emps.add(e2);
        p2Emps.add(e3);

        List<Emp> p3Emps = new ArrayList<>();
        p3Emps.add(e3);

        p1.setEmps(p1Emps);
        p2.setEmps(p2Emps);
        p3.setEmps(p3Emps);

        List<Project> e1Projects = new ArrayList<>();
        e1Projects.add(p3);
        e1.setProjects(e1Projects);

        List<Project> e2Projects = new ArrayList<>();
        e2Projects.add(p2);
        e2Projects.add(p3);
        e2.setProjects(e2Projects);

        List<Project> e3Projects = new ArrayList<>();
        e3Projects.add(p1);
        e3.setProjects(e3Projects);

        Configuration cfg = new Configuration();
        cfg.configure("com.chaitanya.hibernate.d1.sr_011/hibernate.cfg.xml");
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.persist(p1);
        session.persist(p2);
        session.persist(p3);
        session.persist(e1);
        session.persist(e2);
        session.persist(e3);
        transaction.commit();
        session.close();
    }
}

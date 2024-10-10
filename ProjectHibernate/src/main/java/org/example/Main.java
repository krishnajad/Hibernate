package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Configuration cfg=new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Student.class);
        cfg.addAnnotatedClass(Laptop.class);
        cfg.addAnnotatedClass(Subject.class);
        cfg.addAnnotatedClass(Cources.class);
        SessionFactory factory=cfg.buildSessionFactory();
        Session session=factory.openSession();
        Transaction tx= session.beginTransaction();

        //creating cources object
        Cources cs=new Cources();
        cs.setCid(10001);
        cs.setCname("FullStack");



        //creating StudentFullName object
        StudentFullName stn=new StudentFullName();
        stn.setFname("krishna");
        stn.setMname("Dattatray");
        stn.setLname("jadhav");


        //creating Subject object
        Subject sub=new Subject();
        sub.setSubid(1001);
        sub.setSubname("java");


        //creating laptop object
        Laptop lap=new Laptop();
        lap.setLid(101);
        lap.setLlname("Dell");

        //creating Student object
        Student st=new Student();
        st.setId(1);
        st.setName(stn);
        st.setCity("Nanded");
        st.setLap(lap);
        st.getSub().add(sub);
        st.getCs().add(cs);
        cs.getSt().add(st);




        System.out.println(st);

        session.save(st);                                        //storing the data in database
        session.save(lap);
        session.save(sub);
        session.save(cs);

        tx.commit();
        System.out.println(st);
        System.out.println(lap);

        session.close();
    }
}
//   SessionFactory fsctory=new Configuration().configure().buildSessionFactory();
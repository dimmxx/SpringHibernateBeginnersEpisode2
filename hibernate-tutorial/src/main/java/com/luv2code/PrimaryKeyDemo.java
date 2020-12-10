package com.luv2code;

import com.luv2code.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            System.out.println("Create students...");

            Student student1 = new Student("Paul", "Wall", "paul@gmail.com");
            Student student2 = new Student("Mary", "Public", "paul@gmail.com");
            Student student3 = new Student("Bonita", "Applebaum", "paul@gmail.com");


            session.beginTransaction();

            System.out.println("Saving students...");
            session.save(student1);
            session.save(student2);
            session.save(student3);


            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}





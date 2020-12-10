package com.luv2code;

import com.luv2code.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudentDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        long id = 1;

        try {
            session.beginTransaction();
            Student studentFromDb = session.get(Student.class, id);

            studentFromDb.setFirstName("John");
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("update Student set email='mail.com'").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}





package com.luv2code;

import com.luv2code.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteStudentDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        long id = 8;

        try {
            session.beginTransaction();
            Student studentFromDb = session.get(Student.class, id);

            session.delete(studentFromDb);
            session.getTransaction().commit();

            session = factory.getCurrentSession();
            session.beginTransaction();
            session.createQuery("delete Student where id=7").executeUpdate();
            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}





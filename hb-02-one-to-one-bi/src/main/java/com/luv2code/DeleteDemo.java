package com.luv2code;

import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();


        long id = 7;
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();

            Instructor instructor = session.get(Instructor.class, id);
            System.out.println(">>> found instructor: " + instructor);
            System.out.println(">>> deleting instructor: " + instructor);
            if(instructor != null) session.delete(instructor);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

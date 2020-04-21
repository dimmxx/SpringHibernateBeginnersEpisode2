package com.luv2code;

import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetreiveDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        long instructorDetailId = 9;
        Session session = factory.getCurrentSession();

        try {
            session.beginTransaction();
            InstructorDetail instructorDetail = session.get(InstructorDetail.class, instructorDetailId);
            System.out.println(">>> found instructor: " + instructorDetail);
            System.out.println(">>> deleting instructor: " + instructorDetail);

            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}

package com.luv2code;

import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {
            Instructor instructor
                    = new Instructor("Chad", "Darby", "chad@mail.com");
            InstructorDetail instructorDetail
                    = new InstructorDetail("love2cod/youtube.com",
                    "love2code");
            instructor.setInstructorDetail(instructorDetail);
            session.beginTransaction();
            session.save(instructor);
            session.getTransaction().commit();


            Instructor instructor1
                    = new Instructor("Peter", "Johnson", "johnson@mail.com");
            InstructorDetail instructorDetail1
                    = new InstructorDetail("johnson/youtube.com",
                    "guitar");
            instructor1.setInstructorDetail(instructorDetail1);


            session = factory.getCurrentSession();
            session.beginTransaction();
            session.save(instructor1);
            session.getTransaction().commit();


        } finally {
            factory.close();
        }
    }
}

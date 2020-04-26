package com.luv2code;

import com.luv2code.entity.Course;
import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class FetchJoinDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();
        long id = 1;

        //How to avoid LazyInitializationException
        // 1. get instructor.getCourses() inside the session
        // 2. hibernate query with HQL (see FetchJoinDemo.java)

        try {
            session.beginTransaction();

            Query<Instructor> query =
                    session.createQuery("select i from Instructor i "
                                    + "join fetch i.courses "
                                    + "where i.id=:instructorId",
                            Instructor.class);
            query.setParameter("instructorId", id);

            Instructor instructor = query.getSingleResult();

            session.getTransaction().commit();
            session.close();

            System.out.println(instructor);
            System.out.println(instructor.getCourses());


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}

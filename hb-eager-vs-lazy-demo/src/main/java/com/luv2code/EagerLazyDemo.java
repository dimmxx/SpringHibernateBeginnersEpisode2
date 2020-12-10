package com.luv2code;

import com.luv2code.entity.Course;
import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EagerLazyDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();


        //How to avoid LazyInitializationException
        // 1. get instructor.getCourses() inside the session
        // 2. hibernate query with HQL (see FetchJoinDemo.java)

        try {
            long id = 1;

            session.beginTransaction();
            Instructor instructor = session.get(Instructor.class, id);

            System.out.println(">>>" + instructor);
            instructor.getCourses();
            session.getTransaction().commit();


            session.close();

            System.out.println(">>>");


            System.out.println(">>>" + instructor.getInstructorDetail());




        }catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}

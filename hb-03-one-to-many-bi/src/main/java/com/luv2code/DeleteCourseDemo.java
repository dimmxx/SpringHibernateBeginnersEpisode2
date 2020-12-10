package com.luv2code;

import com.luv2code.entity.Course;
import com.luv2code.entity.Instructor;
import com.luv2code.entity.InstructorDetail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteCourseDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Instructor.class)
                .addAnnotatedClass(InstructorDetail.class)
                .addAnnotatedClass(Course.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        long id = 10;

        try {
            session.beginTransaction();

            Course course = session.get(Course.class, id);

            session.delete(course);


            session.getTransaction().commit();
        }catch (Exception e){
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
    }
}

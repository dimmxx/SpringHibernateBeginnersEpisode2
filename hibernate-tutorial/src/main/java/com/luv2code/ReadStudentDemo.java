package com.luv2code;

import com.luv2code.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadStudentDemo {

    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = factory.getCurrentSession();

        try {

            Student student = new Student("Daffy", "Duck", "paul@gmail.com");
            session.beginTransaction();
            System.out.println("Saving the student...");
            System.out.println(student);
            session.save(student);
            session.getTransaction().commit();
            System.out.println("Done!");
            System.out.println(student);


            session = factory.getCurrentSession();
            session.beginTransaction();
            Student studentFromDb = session.get(Student.class, student.getId());
            System.out.println(studentFromDb);

        } finally {
            factory.close();
        }
    }
}





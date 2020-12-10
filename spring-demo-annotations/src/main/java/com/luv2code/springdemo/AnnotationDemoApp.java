package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext contex =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach theCoach = contex.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        contex.close();
        
    }
}

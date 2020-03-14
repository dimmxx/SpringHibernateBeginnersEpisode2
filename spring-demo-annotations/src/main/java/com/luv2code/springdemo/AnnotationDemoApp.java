package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp
{
    public static void main( String[] args ) {

        ClassPathXmlApplicationContext contex =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach tennisCoach = contex.getBean("thatSillyCoach", Coach.class);

        System.out.println(tennisCoach.getDailyWorkout());






    }
}

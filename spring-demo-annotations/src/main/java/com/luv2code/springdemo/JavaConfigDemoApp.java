package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class JavaConfigDemoApp {

    public static void main( String[] args ) {

        AnnotationConfigApplicationContext contex =
                new AnnotationConfigApplicationContext(SportConfig.class);

        Coach theCoach = contex.getBean("tennisCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        contex.close();

    }





}

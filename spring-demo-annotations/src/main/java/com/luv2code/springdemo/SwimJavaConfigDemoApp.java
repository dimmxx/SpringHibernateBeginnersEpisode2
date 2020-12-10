package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

    public static void main( String[] args ) {

        AnnotationConfigApplicationContext contex =
                new AnnotationConfigApplicationContext(SportConfigWithoutAutoScan.class);

        SwimCoach theCoach = contex.getBean("swimCoach", SwimCoach.class);

        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getEmail());
        System.out.println(theCoach.getTeam());

        contex.close();

    }





}

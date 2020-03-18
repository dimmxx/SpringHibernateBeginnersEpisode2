package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach coach1 = context.getBean("tennisCoach", Coach.class);

        Coach coach2 = context.getBean("tennisCoach", Coach.class);

        boolean result = coach1 == coach2;

        System.out.println(result);
        System.out.println(coach1);
        System.out.println(coach2);


    }


}

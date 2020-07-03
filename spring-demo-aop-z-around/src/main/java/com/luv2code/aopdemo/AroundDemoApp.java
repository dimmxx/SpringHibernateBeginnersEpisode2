package com.luv2code.aopdemo;

import com.luv2code.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AroundDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        System.out.println("\nMain Program: AroundDemoApp");
        System.out.println("Main Program: Calling getFortune");
        String data = trafficFortuneService.getFortune();
        System.out.println("Main Program: getFortune: " + data );
        System.out.println("Main Program: finished");

        context.close();
    }

}

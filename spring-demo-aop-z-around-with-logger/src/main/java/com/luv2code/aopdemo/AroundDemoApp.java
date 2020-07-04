package com.luv2code.aopdemo;

import com.luv2code.aopdemo.service.TrafficFortuneService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class AroundDemoApp {

    private static Logger logger = Logger.getLogger(AroundDemoApp.class.getName());

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        TrafficFortuneService trafficFortuneService = context.getBean("trafficFortuneService", TrafficFortuneService.class);

        logger.info("\nMain Program: AroundDemoApp");
        logger.info("Main Program: Calling getFortune");

        String data = trafficFortuneService.getFortune();

        logger.info("Main Program: getFortune: " + data );
        logger.info("Main Program: finished");

        context.close();
    }

}

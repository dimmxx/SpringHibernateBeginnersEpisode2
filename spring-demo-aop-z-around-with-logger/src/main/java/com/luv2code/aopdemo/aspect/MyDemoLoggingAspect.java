package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {

    private Logger logger = Logger.getLogger(MyDemoLoggingAspect.class.getName());

    @Around("execution(* com.luv2code.aopdemo.service.TrafficFortuneService.getFortune(..))")
    public Object aroundGetFortune(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        String method = proceedingJoinPoint.getSignature().toShortString();
        logger.info("\n====>>>> Executing @Around on method: " + method);

        long begin = System.currentTimeMillis();
        logger.info("===>>>> begin " + begin);
        Object result = null;
        result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        logger.info("===>>>> end   " + end);
        long duration = end - begin;
        logger.info("\n====>>>> Duration: " + duration);

        return result;
    }

}

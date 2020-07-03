package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {

    @After("execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))")
    public void afterFinallyFindAccountsAdvice(JoinPoint joinPoint){
        String method = joinPoint.getSignature().toShortString();
        System.out.print("\n===>>>Executing @AfterFinally on method: " + method);
    }

    @AfterThrowing(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "e")
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable e){
        String method = joinPoint.getSignature().toShortString();
        System.out.print("\n===>>>Executing @AfterThrowing on method: " + method);
        System.out.print("\n===>>>Executing @AfterThrowing. Exception: " + e);
    }
}

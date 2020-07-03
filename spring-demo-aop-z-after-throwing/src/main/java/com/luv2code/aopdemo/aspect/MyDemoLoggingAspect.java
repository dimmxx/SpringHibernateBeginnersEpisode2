package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;

@Aspect
@Component
@Order(1)
public class MyDemoLoggingAspect {


    @AfterThrowing(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            throwing = "e")
    public void afterThrowingFindAccountsAdvice(JoinPoint joinPoint, Throwable e){
        String method = joinPoint.getSignature().toShortString();
        System.out.print("\n===>>>Executing @AfterThrowing on method: " + method);
        System.out.print("\n===>>>Executing @AfterThrowing. Exception: " + e);
    }


}

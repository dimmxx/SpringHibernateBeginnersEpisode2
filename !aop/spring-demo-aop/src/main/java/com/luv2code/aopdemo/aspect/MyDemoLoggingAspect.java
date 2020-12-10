package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    //@Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())")
    //@Before("execution(public void addAccount())")
    //@Before("execution(public boolean add*())")
    //@Before("execution(public void add*())")
    //@Before("execution(public * add*())")
    //@Before("execution(public * add*(String))")
    //@Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    //@Before("execution(public * add*(..))")
    //@Before("execution(public * add*(com.luv2code.aopdemo.Account))")
    //@Before("execution(public * add*(com.luv2code.aopdemo.Account, ..))")
    @Before("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    public void beforeAddAccountAdvice(){
        System.out.println(getClass() + " ====>>>> Executing @Before advice");
    }
}

package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.*(..))")
    private void forDaoPackage(){}

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.get*(..))")
    private void forGetters(){}

    @Pointcut("execution(* com.luv2code.aopdemo.dao.*.set*(..))")
    private void forSetters(){}

    @Pointcut("forDaoPackage() && !(forGetters() || forSetters())")
    private void forDaoPackageNoGetterSetter(){}





    @Before("forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(){
        System.out.println(getClass() + " ====>>>> Executing @Before advice");
    }

    @Before("forDaoPackageNoGetterSetter()")
    public void performSystemAnalyticsAdvice(){
        System.out.println(getClass() + " =========>>>>>>>>>>> Executing @Before performSystemAnalyticsAdvice");
    }




}

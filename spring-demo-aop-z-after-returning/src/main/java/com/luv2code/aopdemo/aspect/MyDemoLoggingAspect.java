package com.luv2code.aopdemo.aspect;

import com.luv2code.aopdemo.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
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

    @Before("com.luv2code.aopdemo.aspect.LuvAopExpressions.forDaoPackageNoGetterSetter()")
    public void beforeAddAccountAdvice(JoinPoint joinPoint) {
        System.out.println(getClass() + " ====>>>> Executing @Before advice");
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: " + methodSignature);
        Object[] args = joinPoint.getArgs();
        for(Object arg : args){
            System.out.println(arg);
        }
    }

    @AfterReturning(pointcut="execution(* com.luv2code.aopdemo.dao.AccountDAO.findAccounts(..))",
            returning = "result")
    public void afterReturningAccountsAdvice(JoinPoint joinPoint, List<Account> result){
        String method = joinPoint.getSignature().toShortString();
        System.out.print("\n===>>>Executing @AfterReturning on method: " + method);
        System.out.print("\n===>>>Executing @AfterReturning. Result: " + result);
    }
}

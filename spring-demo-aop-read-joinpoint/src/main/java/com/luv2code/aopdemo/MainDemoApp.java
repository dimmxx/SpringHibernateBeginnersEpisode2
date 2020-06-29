package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);

        accountDAO.setName("foobar");
        accountDAO.setServiceCode(5);

        String name = accountDAO.getName();
        int code = accountDAO.getServiceCode();

        accountDAO.addAccount();
        accountDAO.doSomeWork("hello", true);




        context.close();
    }

}

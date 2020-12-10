package com.luv2code.aopdemo;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.CheckoutDAO;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainDemoApp {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
        CheckoutDAO checkoutDAO = context.getBean("checkoutDAO", CheckoutDAO.class);

        accountDAO.addAccount();
        accountDAO.addAccount();
        checkoutDAO.addAccount();
        checkoutDAO.addCheckout();
        checkoutDAO.addString("");
        accountDAO.addAccount(new Account());
        accountDAO.addAccount(new Account(), true);
        accountDAO.doSomeWork();
        checkoutDAO.goToSleep();




        context.close();
    }

}

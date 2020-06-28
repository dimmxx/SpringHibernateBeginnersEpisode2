package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class CheckoutDAO {

    public void addAccount(){
        System.out.println(getClass() + ": addAccount() method");
    }

    public boolean addCheckout(){
        System.out.println(getClass() + ": addCheckout() method");
        return true;
    }

    public boolean addString(String str){
        System.out.println(getClass() + ": addString() method");
        return true;
    }

    public boolean goToSleep(){
        System.out.println(getClass() + ": goToSleep() method");
        return true;
    }



}

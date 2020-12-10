package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;
import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    public void addAccount(){
        System.out.println(getClass() + ": addAccount() method");
    }

    public void addAccount(Account theAccount){
        System.out.println(getClass() + ": addAccount(Account theAccount) method");
    }

    public void addAccount(Account theAccount, boolean vipFlag){
        System.out.println(getClass() + ": addAccount(Account theAccount, boolean vipFlag) method");
    }

    public void doSomeWork(){
        System.out.println(getClass() + ": doSomeWork() method");
    }



}

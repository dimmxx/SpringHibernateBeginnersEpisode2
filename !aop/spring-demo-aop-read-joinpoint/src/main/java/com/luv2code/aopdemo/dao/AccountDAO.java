package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class AccountDAO {

    private String name;
    private int serviceCode;

    public String getName() {
        System.out.println(getClass() + ": in getName()");
        return name;
    }

    public void setName(String name) {
        this.name = name;
        System.out.println(getClass() + ": in setName()");
    }

    public int getServiceCode() {
        System.out.println(getClass() + ": in getServiceCode()");
        return serviceCode;
    }

    public void setServiceCode(int serviceCode) {
        this.serviceCode = serviceCode;
        System.out.println(getClass() + ": in setServiceCode()");
    }




    public void addAccount(){
        System.out.println(getClass() + ": addAccount() method");
    }

    public boolean doSomeWork(String line, boolean vipPerson){
        System.out.println(getClass() + ": doSomeWork() method");
        return true;
    }



}

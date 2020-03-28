package com.luv2code.springdemo.mvc.model;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private String country;
    private LinkedHashMap<String, String> countryOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("IN", "India");
        countryOptions.put("DE", "Germany");
        countryOptions.put("GB", "Great Britain");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }
}

package com.luv2code.springdemo.mvc.model;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class Student {

    private String firstName;
    private String lastName;
    private String gender;
    private String country;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;
    private String favoriteFramework;
    private List<String> favoriteFrameworkOptions;
    private String[] operatingSystem;
    private String[] favoriteIde;
    private List<String> favoriteIdeOptions;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("IN", "India");
        countryOptions.put("DE", "Germany");
        countryOptions.put("GB", "Great Britain");

        favoriteFrameworkOptions = new ArrayList<>();
        favoriteFrameworkOptions.add("Spring");
        favoriteFrameworkOptions.add("Hibernate");
        favoriteFrameworkOptions.add("Struts");
        favoriteFrameworkOptions.add("Grails");

        favoriteIdeOptions = new ArrayList<>();
        favoriteIdeOptions.add("IntelJIdea");
        favoriteIdeOptions.add("Eclipse");
        favoriteIdeOptions.add("Net Beans");
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

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public void setCountryOptions(LinkedHashMap<String, String> countryOptions) {
        this.countryOptions = countryOptions;
    }

    public List<String> getFavoriteFrameworkOptions() {
        return favoriteFrameworkOptions;
    }

    public void setFavoriteFrameworkOptions(List<String> favoriteFrameworkOptions) {
        this.favoriteFrameworkOptions = favoriteFrameworkOptions;
    }

    public String getFavoriteFramework() {
        return favoriteFramework;
    }

    public void setFavoriteFramework(String favoriteFramework) {
        this.favoriteFramework = favoriteFramework;
    }

    public String[] getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String[] getFavoriteIde() {
        return favoriteIde;
    }

    public void setFavoriteIde(String[] favoriteIde) {
        this.favoriteIde = favoriteIde;
    }

    public List<String> getFavoriteIdeOptions() {
        return favoriteIdeOptions;
    }

    public void setFavoriteIdeOptions(List<String> favoriteIdeOptions) {
        this.favoriteIdeOptions = favoriteIdeOptions;
    }
}

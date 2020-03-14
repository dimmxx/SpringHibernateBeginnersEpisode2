package com.luv2code.springdemo;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String email;
    private String team;
    private String city;
    private String address;


    public CricketCoach() {
        System.out.println("Cricket coach: inside no-arg constructor");
    }

    public void setFortuneService(FortuneService fortuneService){
        System.out.println("Cricket coach: inside setter method");
        this.fortuneService = fortuneService;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Cricket coach: inside email setter method");
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("Cricket coach: inside team setter method");
        this.team = team;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes a day";
    }

    @Override
    public String getDailyForune() {
        return fortuneService.getFortune();
    }
}

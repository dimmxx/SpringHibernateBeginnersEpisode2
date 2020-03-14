package com.luv2code.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach() {
        System.out.println("TrackCoach: Inside empty constructor");
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
        System.out.println("TrackCoach: Inside arg constructor");
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyForune() {
        return "Just do it: " + fortuneService.getFortune();
    }

    public void doMyStartUpStuff(){
        System.out.println("TrackCoach: Inside init method");
    }

    public void doMyCleanUpStuff(){
        System.out.println("TrackCoach: Inside destroy method");
    }
}

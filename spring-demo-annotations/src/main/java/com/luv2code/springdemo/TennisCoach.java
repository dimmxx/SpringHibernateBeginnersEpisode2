package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class TennisCoach implements Coach {

    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    public TennisCoach(){
        System.out.println(">> TennisCoach: inside no-args constructor");
    }

    @PostConstruct
    public void doMyStartupStuff(){
        System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
    }

     @PreDestroy
    public void doMyEndingStuff(){
        System.out.println(">> TennisCoach: inside of doMyEndingStuff()");
    }





    /*@Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }*/

    /*@Autowired
    public void setFortuneService(FortuneService fortuneService){
        this.fortuneService = fortuneService;
        System.out.println(">> TennisCoach: inside setter method");
    }*/

    /*@Autowired
    public void doSomeCrazyStuffMethod(FortuneService fortuneService){
        this.fortuneService = fortuneService;
        System.out.println(">> TennisCoach: inside some method");
    }
*/

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getDailyFortune();
    }
}

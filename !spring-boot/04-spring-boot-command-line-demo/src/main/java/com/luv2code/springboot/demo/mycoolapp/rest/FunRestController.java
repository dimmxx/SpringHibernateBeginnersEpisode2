package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;


    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is " + LocalDateTime.now() + " " + coachName + " " + teamName;
    }

    @GetMapping("/workout")
    public String getWorkout(){
        return "Run your hard 5k today! Time on server is " + LocalDateTime.now();
    }

    @GetMapping("/fortune")
    public String getFortune(){
        return "It is your lucky day today! Time on server is " + LocalDateTime.now();
    }






}

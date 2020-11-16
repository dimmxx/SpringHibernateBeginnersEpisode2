package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class FunRestController {

    @GetMapping("/")
    public String sayHello(){
        return "Hello World! Time on server is " + LocalDateTime.now();
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

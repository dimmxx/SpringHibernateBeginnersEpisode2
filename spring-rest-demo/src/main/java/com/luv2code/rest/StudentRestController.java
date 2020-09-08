package com.luv2code.rest;

import com.luv2code.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentRestController {


    @GetMapping("/student")
    public Student getStudent(){
        return new Student("Dima", "Borysov");
    }



}

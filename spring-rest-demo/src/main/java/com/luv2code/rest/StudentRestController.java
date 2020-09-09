package com.luv2code.rest;

import com.luv2code.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    @GetMapping("/students")
    public List<Student> getStudents(){
        Student student1 = new Student("Dima", "Borysov");
        Student student2 = new Student("Olia", "Borysova");
        List<Student> list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        return list;
    }
}

package com.luv2code.rest;

import com.luv2code.domain.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    @PostConstruct
    private void loadData(){
        Student student1 = new Student("Dima", "Borysov");
        Student student2 = new Student("Olia", "Borysova");
        Student student3 = new Student("John", "Petrson");
        students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    @GetMapping("/students")
    public List<Student> getStudents(){
        return students;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId){
        return students.get(studentId);
    }




}

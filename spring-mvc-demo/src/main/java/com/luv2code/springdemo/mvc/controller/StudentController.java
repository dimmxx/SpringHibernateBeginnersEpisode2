package com.luv2code.springdemo.mvc.controller;

import com.luv2code.springdemo.mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
@RequestMapping("/student")
public class StudentController {

    @RequestMapping("/showForm")
    public String showForm(Model model){
        Student theStudent = new Student();
        model.addAttribute("student", theStudent);
        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student theStudent){
        System.out.println("theStudent: " + theStudent.getFirstName() + " " + theStudent.getLastName());
        System.out.println(theStudent.getCountry());
        System.out.println(Arrays.toString(theStudent.getOperatingSystem()));
        System.out.println(Arrays.toString(theStudent.getFavoriteIde()));
        return "student-confirmation";
    }
}

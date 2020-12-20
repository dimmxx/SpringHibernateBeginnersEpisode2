package com.luv2code.springboot.springbootcruddemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class EmployeeMVCController {

    @GetMapping("/employees")
    public String sayHello(Model model){
        model.addAttribute("theDate", new Date());
        return "helloworld";
    }
}

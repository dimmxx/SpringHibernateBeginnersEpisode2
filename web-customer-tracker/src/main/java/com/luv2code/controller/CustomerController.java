package com.luv2code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping
public class CustomerController {

    @RequestMapping("/")
    public String listCustomers(Model model){
        return "list-customers";
    }
}

package com.luv2code.springboot.springbootcruddemo.controller;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import com.luv2code.springboot.springbootcruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class EmployeeMVCController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/time")
    public String sayTime(Model model){
        model.addAttribute("theDate", new Date());
        return "time";
    }

    @GetMapping("/employees")
    public String getEmployees(Model model){
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "employees_table";
    }
}

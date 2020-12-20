package com.luv2code.springboot.springbootcruddemo.controller;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import com.luv2code.springboot.springbootcruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeMVCController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/time")
    public String sayTime(Model model){
        model.addAttribute("theDate", new Date());
        return "time";
    }

    @GetMapping("/list")
    public String getEmployees(Model model){
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);
        return "/employees/list-employees";
    }

    @GetMapping("/showFormAdd")
    public String showFormAdd(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "/employees/form-save-employee";
    }

    @GetMapping("/showFormUpdate")
    public String showFormUpdate(@RequestParam("employeeId") Long employeeId, Model model){
        Employee employee = employeeService.findById(employeeId);
        model.addAttribute("employee", employee);
        return "/employees/form-save-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeService.save(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/delete")
    public String saveEmployee(@RequestParam("employeeId") Long employeeId){
        employeeService.deleteById(employeeId);
        return "redirect:/employees/list";
    }
}

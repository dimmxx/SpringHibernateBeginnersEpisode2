package com.luv2code.springboot.springbootcruddemo.rest;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import com.luv2code.springboot.springbootcruddemo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeRestController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/employees")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee findAllById(@PathVariable Long employeeId) {
        return employeeService.findById(employeeId);
    }

    @PostMapping("/employees/")
    public Employee save(@RequestBody Employee employee) {
        employee.setId(null);
        //employee.
        return employeeService.save(employee);
    }

    @PutMapping("/employees/")
    public Employee update(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @DeleteMapping("/employees/{employeeId}")
    public Employee deleteById(@PathVariable Long employeeId) {
        return employeeService.deleteById(employeeId);
    }
}

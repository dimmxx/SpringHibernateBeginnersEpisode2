package com.luv2code.springboot.springbootcruddemo.service;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Long id);

    Employee save(Employee employee);

    Employee deleteById(Long id);






}

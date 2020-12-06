package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {

    Optional<List<Employee>> findAll();

    Optional<Employee> findById(Long id);

    Employee save(Employee employee);

    void deleteById(Long id);

}

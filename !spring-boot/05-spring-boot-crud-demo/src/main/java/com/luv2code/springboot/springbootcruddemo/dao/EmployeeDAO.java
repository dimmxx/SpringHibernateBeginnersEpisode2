package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeDAO {

    public Optional<List<Employee>> findAll();

}

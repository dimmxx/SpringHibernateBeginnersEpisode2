package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

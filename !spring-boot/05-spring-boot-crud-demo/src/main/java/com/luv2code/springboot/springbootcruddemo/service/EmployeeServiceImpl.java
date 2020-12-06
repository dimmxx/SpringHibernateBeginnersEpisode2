package com.luv2code.springboot.springbootcruddemo.service;

import com.luv2code.springboot.springbootcruddemo.dao.EmployeeDAO;
import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeDAO employeeDAO;

    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll().orElseThrow();
    }

    @Override
    @Transactional
    public Employee findById(Long id) {
        return employeeDAO.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Employee with id %d not found", id)));
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeDAO.save(employee);
    }

    @Override
    @Transactional
    public Employee deleteById(Long id) {
        Employee employee = employeeDAO.findById(id)
                .orElseThrow(() -> new RuntimeException(String.format("Employee with id %d not found", id)));
        employeeDAO.deleteById(id);
        return employee;
    }
}

package com.luv2code.springboot.springbootcruddemo.service;

import com.luv2code.springboot.springbootcruddemo.dao.EmployeeRepository;
import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeRepository.findAllByOrderByLastNameAsc();
    }

    @Override
    @Transactional
    public Employee findById(Long id) {
        return employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException(String.format("Employee with id %d not found", id)));
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    @Transactional
    public Employee deleteById(Long id) {
        Employee employee = findById(id);
        employeeRepository.deleteById(id);
        return employee;
    }
}

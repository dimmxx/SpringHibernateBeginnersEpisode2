package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository("daoJpa")
public class EmployeeDAOJpaImpl implements EmployeeDAO {

    private final EntityManager em;

    @Autowired
    public EmployeeDAOJpaImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Optional<List<Employee>> findAll() {
        TypedQuery<Employee> typedQuery = em.createQuery("select e from Employee e", Employee.class);
        List<Employee> employees = typedQuery.getResultList();
        return Optional.of(employees);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        Employee employee = em.find(Employee.class, id);
        if (employee != null) {
            return Optional.of(employee);
        } else {
            return Optional.empty();
        }
    }

    @Override
    public Employee save(Employee employee) {
        Employee dbEmployee = em.merge(employee);
        employee.setId(dbEmployee.getId());
        return dbEmployee;
    }

    @Override
    public void deleteById(Long id) {
        Query query = em.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}

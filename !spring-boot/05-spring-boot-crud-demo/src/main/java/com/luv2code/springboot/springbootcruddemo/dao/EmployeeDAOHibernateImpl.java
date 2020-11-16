package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Repository
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    private EntityManager em;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    @Transactional
    public Optional<List<Employee>> findAll() {
        Session session = em.unwrap(Session.class);
        Query<Employee> query = session.createQuery("from Employee", Employee.class);

        List<Employee> employees = query.getResultList();

        return Optional.of(employees);
    }
}

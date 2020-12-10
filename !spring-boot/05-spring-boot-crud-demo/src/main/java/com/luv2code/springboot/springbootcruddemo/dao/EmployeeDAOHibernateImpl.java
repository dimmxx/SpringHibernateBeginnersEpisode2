package com.luv2code.springboot.springbootcruddemo.dao;

import com.luv2code.springboot.springbootcruddemo.entity.Employee;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.Optional;

@Repository("daoHibernate")
public class EmployeeDAOHibernateImpl implements EmployeeDAO {

    private final EntityManager em;

    @Autowired
    public EmployeeDAOHibernateImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public Optional<List<Employee>> findAll() {
        Session session = em.unwrap(Session.class);
        TypedQuery<Employee> typedQuery = session.createQuery("select e from Employee e", Employee.class);
        List<Employee> employees = typedQuery.getResultList();
        return Optional.of(employees);
    }

    @Override
    public Optional<Employee> findById(Long id) {
        Session session = em.unwrap(Session.class);
        Employee employee = session.get(Employee.class, id);
        if(employee != null){
            return Optional.of(employee);
        }else {
            return Optional.empty();
        }
    }

    @Override
    public Employee save(Employee employee) {
        Session session = em.unwrap(Session.class);
        session.saveOrUpdate(employee);
        return employee;
    }

    @Override
    public void deleteById(Long id) {
        Session session = em.unwrap(Session.class);
        Query query = session.createQuery("delete from Employee where id=:employeeId");
        query.setParameter("employeeId", id);
        query.executeUpdate();
    }
}

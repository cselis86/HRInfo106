package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by elis on 18/10/2015.
 */
@Repository
@Transactional
@SuppressWarnings("unchecked")
public class EmployeeDaoImpl implements EmployeeDao {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public void delete(Employee emp) {
        sessionFactory.getCurrentSession().delete(emp);
    }

    @Override
    public void save(Employee emp) {
        sessionFactory.getCurrentSession().save(emp);
    }

    @Override
    public void update(Employee emp) {
        sessionFactory.getCurrentSession().saveOrUpdate(emp);
    }

    @Override
    public Employee getById(Integer id) {
        return (Employee) sessionFactory.getCurrentSession()
                .createCriteria(Employee.class)
                .add(Restrictions.eq("id", id)).uniqueResult();
    }

    @Override
    public List<Employee> getAll() {
        String hql = "from com.springapp.mvc.model.Employee";
//        return sessionFactory.getCurrentSession().createQuery(hql).list();
        return sessionFactory.getCurrentSession().createCriteria(Employee.class).list();
    }
}

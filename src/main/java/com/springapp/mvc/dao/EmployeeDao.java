package com.springapp.mvc.dao;

import com.springapp.mvc.model.Employee;

import java.util.List;

/**
 * Created by elis on 18/10/2015.
 */
public interface EmployeeDao {
    void save(Employee emp);
    void update(Employee emp);
    void delete(Employee emp);
    List<Employee> getAll();
    Employee getById(Integer id);
}

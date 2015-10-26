package com.springapp.mvc.dao;

import com.springapp.mvc.model.Department;

import java.util.List;

/**
 * Created by elis on 19/10/2015.
 */

public interface DepartmentDao {

    void save(Department dept);
    void update(Department dept);
    void delete(Department dept);
    List<Department> getAll();
    List<Department> getDeptByLocFk(Long fkId);
    Department getById(Long id);

}

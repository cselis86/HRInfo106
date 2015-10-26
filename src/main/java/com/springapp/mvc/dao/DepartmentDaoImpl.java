package com.springapp.mvc.dao;

import com.springapp.mvc.model.Department;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by elis on 19/10/2015.
 */
@Repository
@Transactional
public class DepartmentDaoImpl implements DepartmentDao{
    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(Department dept) {

    }

    @Override
    public void update(Department dept) {

    }

    @Override
    public void delete(Department dept) {

    }

    @Override
    public List<Department> getAll() {
        return null;
    }

    @Override
    public List<Department> getDeptByLocFk(Long fk) {
        return sessionFactory.getCurrentSession().createCriteria(Department.class)
                .add(Restrictions.eq("fkLocId",fk)).list();
    }

    @Override
    public Department getById(Long id) {

        return (Department) sessionFactory.getCurrentSession().createCriteria(Department.class)
                .add(Restrictions.eq("id",id)).uniqueResult();
    }


}

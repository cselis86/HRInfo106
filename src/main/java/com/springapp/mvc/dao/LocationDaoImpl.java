package com.springapp.mvc.dao;

import com.springapp.mvc.model.Location;
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
public class LocationDaoImpl implements LocationDao {

    @Autowired
    private SessionFactory sessionfactory;

    @Override
    public void save(Location loc) {
        sessionfactory.getCurrentSession().save(loc);
    }

    @Override
    public void update(Location loc) {

    }

    @Override
    public void delete(Long locId) {
        Location location = (Location) sessionfactory.getCurrentSession().load(
                Location.class, locId);
        if (null!=location){
            sessionfactory.getCurrentSession().delete(location);
        }
    }

    @Override
    public List<Location> getAll() {
        return sessionfactory.getCurrentSession().createCriteria(Location.class).list();
    }

    @Override
    public Location getById(Integer id) {

        return (Location)sessionfactory.getCurrentSession().createCriteria(Location.class).add(Restrictions.eq("id",id)).uniqueResult();
    }
}

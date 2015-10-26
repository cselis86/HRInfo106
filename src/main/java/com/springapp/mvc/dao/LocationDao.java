package com.springapp.mvc.dao;

import com.springapp.mvc.model.Location;

import java.util.List;

/**
 * Created by elis on 19/10/2015.
 */
public interface LocationDao {
    void save(Location loc);
    void update(Location loc);
    void delete(Long locId);
    List<Location> getAll();
    Location getById(Integer id);
}

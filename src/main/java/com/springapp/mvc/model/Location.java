package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * Created by elis on 19/10/2015.
 */
@Entity
@Table(name = "LOCATION")
public class Location {

    @Id
    @Column
    @GeneratedValue
    private long Id;

    @Column
    private String name;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



}

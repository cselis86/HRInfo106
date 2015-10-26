package com.springapp.mvc.model;

import javax.persistence.*;

/**
 * Created by elis on 19/10/2015.
 */
@Entity
@Table(name = "DEPARTMENT")
public class Department {

    @Id
    @Column
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LOC_ID")
    private Location fkLocId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getFkLocId() {
        return fkLocId;
    }

    public void setFkLocId(Location fkLocId) {
        this.fkLocId = fkLocId;
    }
}

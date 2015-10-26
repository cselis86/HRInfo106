package com.springapp.mvc.model;

import javax.persistence.*;
import java.security.acl.LastOwnerException;

/**
 * Created by elis on 18/10/2015.
 */
@Entity
@Table
public class Employee {
    @Id
    @Column
    @GeneratedValue
    private Integer id;

    @Column
    private String firstname;

    @Column
    private String lastname;

    @Column
    private String email;

    @Column
    private String telephone;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DEPT_ID")
    private Department fk_DeptId;

    public Department getFk_DeptId() {
        return fk_DeptId;
    }

    public void setFk_DeptId(Department fk_DeptId) {
        this.fk_DeptId = fk_DeptId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                '}';
    }
}

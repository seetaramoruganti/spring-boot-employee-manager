package com.ford.employeemanager.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer"})   //by adding this i was able to retrive a employee by id from DB 
public class Employee {

    @Id
    private int id;
    private String name;
    private String email;
    private String salary;

    public Employee() {
    }

    public Employee(int id, String name, String email, String salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

}

package com.manish.SpringBootDemo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Employee {
    @JsonIgnore
    String id;
    String name;
    String department;

    public Employee() {
    }

    public Employee(String id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}

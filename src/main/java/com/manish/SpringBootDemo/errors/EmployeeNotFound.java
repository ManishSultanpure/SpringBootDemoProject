package com.manish.SpringBootDemo.errors;

import com.manish.SpringBootDemo.model.Employee;

public class EmployeeNotFound extends  RuntimeException{
    public EmployeeNotFound(String message){
        super(message);
    }
}

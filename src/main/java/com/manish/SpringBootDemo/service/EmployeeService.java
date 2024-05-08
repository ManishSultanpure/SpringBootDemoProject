package com.manish.SpringBootDemo.service;

import com.manish.SpringBootDemo.model.Employee;

import java.util.List;

public interface EmployeeService {

    Employee saveEmployee(Employee emp);

    Employee getEmployee(String id);

    List<Employee> getAllEmployee();
}

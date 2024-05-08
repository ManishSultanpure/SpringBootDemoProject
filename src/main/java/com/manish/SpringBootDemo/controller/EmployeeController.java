package com.manish.SpringBootDemo.controller;

import com.manish.SpringBootDemo.model.Employee;
import com.manish.SpringBootDemo.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

@Autowired
private EmployeeServiceImpl employeeService;


@PostMapping
    Employee save(@RequestBody Employee emp){
    return employeeService.saveEmployee(emp);
}

    @GetMapping(value = "{id}")
    Employee getEmployee(@PathVariable String id){
        return employeeService.getEmployee(id);
    }
    @GetMapping
    List<Employee> get(){
        return employeeService.getAllEmployee();
    }
}

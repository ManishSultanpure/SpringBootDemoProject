package com.manish.SpringBootDemo.service;

import com.manish.SpringBootDemo.errors.EmployeeNotFound;
import com.manish.SpringBootDemo.model.Employee;
import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{
  public List<Employee> list=new ArrayList<>();
    @Override
    public Employee saveEmployee(Employee emp) {
        if(emp.getId()==null){
            emp.setId(UUID.randomUUID().toString());
        }
        list.add(emp);
        return emp;
    }

    @Override
    public Employee getEmployee(String id) {
      return  list.stream().filter(l->l.getId().equalsIgnoreCase(id)).findFirst().orElseThrow(()->new EmployeeNotFound("Employee Not found"+id));
    }

    @Override
    public List<Employee> getAllEmployee(){
        return list;
    }

}

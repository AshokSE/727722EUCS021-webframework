package com.example.gurucharanq4.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq4.model.Employee;
import com.example.gurucharanq4.repository.EmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    public EmployeeRepo employeeRepo;

    public Employee postData(Employee p){
        return employeeRepo.save(p);
    }

    public Employee getOneData(int id){
        return employeeRepo.findById(id).orElseThrow();
    }

    public List<Employee> getData(){
        return employeeRepo.findAll();
    }

    public void deleteData(int id){
        employeeRepo.deleteById(id);
    }

    public Employee putData(int id,Employee p){
        Employee pr=employeeRepo.findById(id).orElseThrow();
        pr.setName(p.getName());
        pr.setCompany(p.getCompany());
        pr.setPosition(p.getPosition());
        return employeeRepo.save(pr);
    }
}

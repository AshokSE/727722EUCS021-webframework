package com.example.day14ce1.ashokservice;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.ashokmodel.ashokEmployee;
import com.example.day14ce1.ashokrepository.ashokEmployeeRepo;

@Service

public class ashokEmployeeService {
    @Autowired
    ashokEmployeeRepo employeeRepo;

    public ashokEmployee addEmployee(ashokEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<ashokEmployee> getEmployees()
    {
        return employeeRepo.findAll();
    }

    public Optional<ashokEmployee> getEmployee(Long employeeId)
    {
        return employeeRepo.findById(employeeId);
    }

}

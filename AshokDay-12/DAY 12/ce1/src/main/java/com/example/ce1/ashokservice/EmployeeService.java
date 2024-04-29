package com.example.ce1.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.ashokmodel.ashokEmployee;
import com.example.ce1.ashokrepository.ashokEmployeeRepo;

@Service
public class EmployeeService {
    @Autowired
    ashokEmployeeRepo employeeRepo;

    @SuppressWarnings("null")
    public ashokEmployee setEmployee(ashokEmployee employee)
    {
        return employeeRepo.save(employee);
    }

    public List<ashokEmployee> getInnerEmployee()
    {
        return employeeRepo.getByInnerEmployees();
    }

    public List<ashokEmployee> getLeftOuterEmployee()
    {
        return employeeRepo.getByLeftOuterEmployees();
    }
}

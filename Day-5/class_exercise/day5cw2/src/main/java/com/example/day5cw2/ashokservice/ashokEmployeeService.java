package com.example.day5cw2.ashokservice;

import org.springframework.stereotype.Service;

import com.example.day5cw2.ashokmodel.ashokEmployee;
import com.example.day5cw2.ashokrepository.ashokEmployeeRepo;

@Service
public class ashokEmployeeService {
    public ashokEmployeeRepo employeeRepo;
    public ashokEmployeeService(ashokEmployeeRepo employeeRepo)
    {
        this.employeeRepo = employeeRepo;
    }
    public boolean saveEmployee(ashokEmployee employee)
    {
        try
        {
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ashokEmployee employee)
    {
        if(this.getEmployeeById(id)==null)
        {
            return false;
        }
        try{
            employeeRepo.save(employee);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteEmployee(int id)
    {
        if(this.getEmployeeById(id) == null)
        {
            return false;
        }
        employeeRepo.deleteById(id);
        return true;
    }
    public ashokEmployee getEmployeeById(int id)
    {
        return employeeRepo.findById(id).orElse(null);
    }
}

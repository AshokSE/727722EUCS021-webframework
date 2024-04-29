package com.example.ce1.ashokcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ce1.ashokmodel.ashokEmployee;
import com.example.ce1.ashokservice.EmployeeService;

@RestController
public class ashokEmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("/employee")
    public ashokEmployee setMethod(@RequestBody ashokEmployee employee)
    {
        return employeeService.setEmployee(employee);
    }

    @GetMapping("/employees-inner-join")
    public List<ashokEmployee> getInnerMethod()
    {
        return employeeService.getInnerEmployee();
    }

    @GetMapping("/employees-left-outer-join")
    public List<ashokEmployee> getLeftMethod()
    {
        return employeeService.getLeftOuterEmployee();
    }
}

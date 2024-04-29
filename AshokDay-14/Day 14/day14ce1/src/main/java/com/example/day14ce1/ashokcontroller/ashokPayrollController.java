package com.example.day14ce1.ashokcontroller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.day14ce1.ashokmodel.ashokPayroll;
import com.example.day14ce1.ashokservice.ashokPayrollService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ashokPayrollController {
    @Autowired
    ashokPayrollService PayrollService;

    @PutMapping("/employee/{employeeId}/payroll")
    public ashokPayroll addPayroll(@PathVariable Long employeeId,@RequestBody ashokPayroll payroll) {
        return PayrollService.addPayroll(employeeId,payroll);
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public Optional<ashokPayroll> getMethodName(@PathVariable Long employeeId) {
        return PayrollService.getPayroll(employeeId);
    }
    
    
}

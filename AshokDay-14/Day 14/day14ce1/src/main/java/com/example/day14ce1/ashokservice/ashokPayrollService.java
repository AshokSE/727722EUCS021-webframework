package com.example.day14ce1.ashokservice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day14ce1.ashokmodel.ashokPayroll;
import com.example.day14ce1.ashokrepository.ashokPayrollRepo;

@Service
public class ashokPayrollService {
    @Autowired
    ashokPayrollRepo payrollRepo;

    public ashokPayroll addPayroll(Long id,ashokPayroll payroll)
    {
        ashokPayroll avail = payrollRepo.findById(id).orElse(null);

        if(avail!=null){
            avail.setAmount(payroll.getAmount());
            avail.setNoOfDaysWorked(payroll.getNoOfDaysWorked());
        return payrollRepo.save(avail);
        }
        else 
        return null;
    }

    public Optional<ashokPayroll> getPayroll(Long employeeId)
    {
        return payrollRepo.findById(employeeId);
    }
}

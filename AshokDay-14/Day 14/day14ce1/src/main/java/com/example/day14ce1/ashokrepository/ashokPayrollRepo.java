package com.example.day14ce1.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce1.ashokmodel.ashokPayroll;

@Repository
public interface ashokPayrollRepo extends JpaRepository<ashokPayroll,Long> {
    
}

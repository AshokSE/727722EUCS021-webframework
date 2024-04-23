package com.example.day5cw2.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw2.ashokmodel.ashokEmployee;


@Repository
public interface ashokEmployeeRepo extends JpaRepository<ashokEmployee,Integer>{
    
}

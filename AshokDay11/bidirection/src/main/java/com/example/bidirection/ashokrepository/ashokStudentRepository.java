package com.example.bidirection.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.ashokmodel.ashokStudent;



@Repository
public interface ashokStudentRepository extends JpaRepository<ashokStudent,Integer>{
    
}

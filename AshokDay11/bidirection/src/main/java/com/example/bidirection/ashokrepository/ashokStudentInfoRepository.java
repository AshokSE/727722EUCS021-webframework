package com.example.bidirection.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.bidirection.ashokmodel.ashokStudentInfo;

@Repository
public interface ashokStudentInfoRepository extends JpaRepository<ashokStudentInfo,Integer>{
    
}
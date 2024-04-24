package com.example.relation.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.ashokmodel.ashokStudentInfo;

@Repository
public interface ashokStudentInfoRepository extends JpaRepository<ashokStudentInfo,Integer>{
    
}
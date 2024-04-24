package com.example.relation.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.relation.ashokmodel.ashokStudent;

@Repository
public interface ashokStudentRepository extends JpaRepository<ashokStudent,Integer>{
    
}

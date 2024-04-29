package com.example.day14ce2.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day14ce2.ashokmodel.ashokBook;

@Repository
public interface ashokBookRepo extends JpaRepository<ashokBook,Integer> {
    
}

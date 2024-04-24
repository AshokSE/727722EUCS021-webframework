package com.example.springapp.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapp.ashokmodel.ashokPerson;

import java.util.List;


@Repository
public interface ashokPersonRepo extends JpaRepository<ashokPerson,Integer>{

    List<ashokPerson> findByNameStartingWith(String name);
    List<ashokPerson> findByNameEndingWith(String name);
    
}

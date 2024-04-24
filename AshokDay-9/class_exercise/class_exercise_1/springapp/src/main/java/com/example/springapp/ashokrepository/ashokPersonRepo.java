package com.example.springapp.ashokrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.springapp.ashokmodel.ashokPerson;

public interface ashokPersonRepo extends JpaRepository<ashokPerson, Integer> {
    @Query("SELECT p FROM Person p WHERE age=?1")
    List<ashokPerson> findByAge(int age);
}

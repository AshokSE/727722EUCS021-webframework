package com.example.gurucharanq1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq1.model.Person;

public interface PersonRepo extends JpaRepository<Person,Integer> {

}

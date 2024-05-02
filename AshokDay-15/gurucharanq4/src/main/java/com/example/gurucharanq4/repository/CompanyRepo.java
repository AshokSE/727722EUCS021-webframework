package com.example.gurucharanq4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq4.model.Company;

public interface CompanyRepo extends JpaRepository<Company,Integer> {

}

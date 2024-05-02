package com.example.gurucharanq4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq4.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee,Integer> {

}

package com.example.gurucharanq3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.gurucharanq3.model.Product;

public interface ProductRepo extends JpaRepository<Product,Integer> {

}

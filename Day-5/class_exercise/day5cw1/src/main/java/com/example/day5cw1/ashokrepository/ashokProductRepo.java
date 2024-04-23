package com.example.day5cw1.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.day5cw1.ashokmodel.ashokProduct;

@Repository
public interface ashokProductRepo extends JpaRepository<ashokProduct,Integer>{
    
}

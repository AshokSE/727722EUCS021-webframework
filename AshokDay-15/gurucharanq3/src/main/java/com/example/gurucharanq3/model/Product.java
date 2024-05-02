package com.example.gurucharanq3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
    @Id
    public int id;
    public String name;
    public double price;
}

package com.example.gurucharanq3.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import com.example.gurucharanq3.model.Product;
import com.example.gurucharanq3.service.ProductService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class ProductController {
    @Autowired
    public ProductService productService;

    @GetMapping("/products")
    public List<Product> getMethodName() {
        log.info("method:{GET}");
        return productService.getData();
    }

    @GetMapping("/products/{id}")
    public Product getOneMethodName(@PathVariable int param) {
        log.info("method:{GET}");
        return productService.getOneData(param);
    }

    @PostMapping("/products")
    public Product postMethodName(@RequestBody Product entity) {
        log.info("method:{POST}");
        return productService.postData(entity);
    }
    
    @DeleteMapping("products/{id}")
    public String deleteMethodName(@PathVariable int id){
        productService.deleteData(id);
        log.info("method:{DELETE}");
        return "Deleted";
    }
    
    @PutMapping("products/{id}")
    public Product putMethodName(@PathVariable int id, @RequestBody Product entity) {
        log.info("method:{PUT}");
        return productService.putData(id, entity);
    }

}

package com.example.day5cw1.ashokservice;

import org.springframework.stereotype.Service;

import com.example.day5cw1.ashokmodel.ashokProduct;
import com.example.day5cw1.ashokrepository.ashokProductRepo;

@Service
public class ashokProductService {
    public ashokProductRepo productRepo;
    public ashokProductService(ashokProductRepo productRepo)
    {
        this.productRepo = productRepo;
    }
    public boolean saveProduct(ashokProduct product)
    {
        try
        {
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean updateDetails(int id,ashokProduct product)
    {
        if(this.getProductById(id)==null)
        {
            return false;
        }
        try{
            productRepo.save(product);
        }
        catch(Exception e)
        {
            return false;
        }
        return true;
    }
    public boolean deleteProduct(int id)
    {
        if(this.getProductById(id) == null)
        {
            return false;
        }
        productRepo.deleteById(id);
        return true;
    }
    public ashokProduct getProductById(int id)
    {
        return productRepo.findById(id).orElse(null);
    }
}

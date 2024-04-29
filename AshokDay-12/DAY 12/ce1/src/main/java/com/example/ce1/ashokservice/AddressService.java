package com.example.ce1.ashokservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ce1.ashokmodel.ashokAddress;
import com.example.ce1.ashokrepository.ashokAddressRepo;
import com.example.ce1.ashokrepository.ashokEmployeeRepo;

@Service
public class AddressService {
    @Autowired
    ashokAddressRepo addressRepo;
    @Autowired
    ashokEmployeeRepo employeeRepo;
    public ashokAddress setAddressById(int id,ashokAddress address)
    {
        if(employeeRepo.existsById(id))
        {
            addressRepo.setByemployeeId(address.getCity(), address.getStreet(), id);
            return address;
        }
        else
        {
            return null;
        }
    }
}

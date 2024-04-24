package com.example.springapp.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.ashokmodel.ashokPerson;
import com.example.springapp.ashokrepository.ashokPersonRepo;

@Service
public class ashokPersonService {
    @Autowired
    private ashokPersonRepo rep;

    public boolean post(ashokPerson person)
    {
        try
        {
            rep.save(person);
            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    public List<ashokPerson> start(String value)
    {
        return rep.findByNameStartingWith(value);
    }

    public List<ashokPerson> end(String value)
    {
        return rep.findByNameEndingWith(value);
    }
    
}

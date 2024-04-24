package com.example.springapp.ashokservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springapp.ashokmodel.ashokPerson;
import com.example.springapp.ashokrepository.ashokPersonRepo;

@Service
public class ashokPersonService {
    public ashokPersonRepo personRepo;

    public ashokPersonService(ashokPersonRepo personRepo) {
        this.personRepo = personRepo;
    }

    public boolean savePerson(ashokPerson person) {
        try {
            personRepo.save(person);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public List<ashokPerson> getPersonByAge(int age) {
        return personRepo.findByAge(age);
    }
}

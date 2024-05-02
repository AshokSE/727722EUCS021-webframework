package com.example.gurucharanq1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.gurucharanq1.model.Person;
import com.example.gurucharanq1.repository.PersonRepo;

@Service
public class PersonService {
    @Autowired
    public PersonRepo personRepo;
    public List<Person> getData(){
        return personRepo.findAll();
    }
    public Person postDaata(Person p){
        return personRepo.save(p);
    }
}

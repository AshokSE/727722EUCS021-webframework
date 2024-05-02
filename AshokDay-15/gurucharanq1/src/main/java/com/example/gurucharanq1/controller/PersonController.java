package com.example.gurucharanq1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.gurucharanq1.model.Person;
import com.example.gurucharanq1.service.PersonService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PersonController {
    @Autowired
    public PersonService personService;

    @GetMapping("/persons")
    public List<Person> getMethodName() {
        return personService.getData();
    }

    @PostMapping("/persons")
    public Person postMethodName(@RequestBody Person entity) {
        return personService.postDaata(entity);
    }
    
    
}

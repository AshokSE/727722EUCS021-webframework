package com.examly.class_exercise_1.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.examly.class_exercise_1.ashokmodel.ashokPerson;
import com.examly.class_exercise_1.ashokrepository.ashokPersonRepo;

@Service
public class ashokPersonService {

     @Autowired
     public ashokPersonRepo personRepo;

     public ashokPerson SaveEntity(ashokPerson entity) {
          return personRepo.save(entity);

     }

     public List<ashokPerson> getDetails() {
          return personRepo.findAll();

     }

     public List<ashokPerson> findByAge(int byAge) {
          return personRepo.findByAge(byAge);
     }

}

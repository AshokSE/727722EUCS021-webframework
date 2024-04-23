package com.example.class_exercise_2.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.class_exercise_2.ashokmodel.ashokStudent;
import com.example.class_exercise_2.ashokrepository.ashokStudentRepo;

@Service
public class ashokStudentService {

     @Autowired
     public ashokStudentRepo studentRepo;

     public List<ashokStudent> getAll() {
          return studentRepo.findAll();
     }

     public ashokStudent post(ashokStudent student) {
          return studentRepo.save(student);
     }

     public List<ashokStudent> sortedDetails(String field) {
          return studentRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }
}

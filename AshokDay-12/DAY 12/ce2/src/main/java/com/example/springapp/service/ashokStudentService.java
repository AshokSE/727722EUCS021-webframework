package com.example.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.ashokmodel.ashokStudent;
import com.example.springapp.ashokrepository.ashokStudentRepository;

@Service
public class ashokStudentService {
    @Autowired
    ashokStudentRepository studentRepository;
    public ashokStudent addStudents(ashokStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ashokStudent>getStudent()
    {
        return studentRepository.findAll();
    }
    public List<ashokStudent>getStudentInner()
    {
        return studentRepository.getStudentInner();
    }
    public List<ashokStudent>getStudentLeftOuter()
    {
        return studentRepository.getStudentsLeftOuter();
    }
    
}

package com.example.relation.ashokservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.relation.ashokmodel.ashokStudent;
import com.example.relation.ashokrepository.ashokStudentRepository;

@Service
public class ashokStudentService {
    public ashokStudentRepository studentRepository;
    public ashokStudentService(ashokStudentRepository studentRepository)
    {
        this.studentRepository = studentRepository;
    }
    public ashokStudent saveStudent(ashokStudent student)
    {
        return studentRepository.save(student);
    }
    public List<ashokStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

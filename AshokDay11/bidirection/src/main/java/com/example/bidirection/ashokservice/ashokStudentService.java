package com.example.bidirection.ashokservice;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bidirection.ashokmodel.ashokStudent;
import com.example.bidirection.ashokmodel.ashokStudentInfo;
import com.example.bidirection.ashokrepository.ashokStudentInfoRepository;
import com.example.bidirection.ashokrepository.ashokStudentRepository;

@Service
public class ashokStudentService {
    public ashokStudentRepository studentRepository;
    public ashokStudentInfoRepository studentInfoRepository;
    public ashokStudentService(ashokStudentRepository studentRepository,ashokStudentInfoRepository studentInfoRepository)
    {
        this.studentRepository = studentRepository;
        this.studentInfoRepository = studentInfoRepository;
    }
    public ashokStudent saveStudent(ashokStudent student)
    {
        return studentRepository.save(student);
    }
    public ashokStudentInfo saveStudentInfo(ashokStudentInfo studentInfo)
    {
        return studentInfoRepository.save(studentInfo);
    }
    public List<ashokStudent> getStudents()
    {
        return studentRepository.findAll();
    }
}

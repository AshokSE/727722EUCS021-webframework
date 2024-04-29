package com.example.springapp.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springapp.ashokmodel.ashokStudentDetail;
import com.example.springapp.ashokrepository.ashokStudentDetailRepository;
import com.example.springapp.ashokrepository.ashokStudentRepository;

@Service
public class ashokStudentDetailService {
    @Autowired
    ashokStudentDetailRepository studentDetailRepository;
    @Autowired
    ashokStudentRepository studentRepository;
    public ashokStudentDetail addStudentDetail(int id,ashokStudentDetail studentDetail)
    {
        if(studentRepository.existsById(id))
        {
            studentDetailRepository.addStudentDetail(studentDetail.getAddress(),studentDetail.getPhoneNumber(),id);
            return studentDetail;
        }
        else
        return null;
    }
    
    
}

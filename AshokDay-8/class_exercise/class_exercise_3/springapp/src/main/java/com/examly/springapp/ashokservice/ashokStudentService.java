package com.examly.springapp.ashokservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examly.springapp.ashokmodel.ashokStudent;
import com.examly.springapp.ashokrepository.ashokStudentRepo;

@Service
public class ashokStudentService {
    @Autowired
    private ashokStudentRepo studentRepo;

    public boolean post(ashokStudent student) {
        try {
            studentRepo.save(student);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public List<ashokStudent> start(int mark) {
        return studentRepo.findByMarksGreaterThan(mark);
    }

    public List<ashokStudent> end(int mark) {
        return studentRepo.findByMarksLessThan(mark);
    }

}

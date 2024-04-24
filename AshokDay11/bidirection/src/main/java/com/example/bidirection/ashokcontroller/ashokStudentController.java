package com.example.bidirection.ashokcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.bidirection.ashokmodel.ashokStudent;
import com.example.bidirection.ashokmodel.ashokStudentInfo;
import com.example.bidirection.ashokservice.ashokStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class ashokStudentController {
    public ashokStudentService studentService;
    public ashokStudentController(ashokStudentService studentService)
    {
        this.studentService = studentService;
    }
    @PostMapping("/api/poststudent")
    public ashokStudent postMethodName(@RequestBody ashokStudent student) {
        return studentService.saveStudent(student);
    }
    @PostMapping("/api/poststudentinfo")
    public ashokStudentInfo postMethodName(@RequestBody ashokStudentInfo studentInfo) {
        return studentService.saveStudentInfo(studentInfo);
    }
    @GetMapping("/api/student")
    public List<ashokStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}
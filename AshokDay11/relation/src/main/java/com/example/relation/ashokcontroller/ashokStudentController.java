package com.example.relation.ashokcontroller;

import org.springframework.web.bind.annotation.RestController;

import com.example.relation.ashokmodel.ashokStudent;
import com.example.relation.ashokservice.ashokStudentService;

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
    @PostMapping("/api/student")
    public ashokStudent postMethodName(@RequestBody ashokStudent student) {
        return studentService.saveStudent(student);
    }
    @GetMapping("/api/student")
    public List<ashokStudent> getMethodName() {
        return studentService.getStudents();
    }
    
}

package com.examly.class_exercise_2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_2.model.ashokCourse;
import com.examly.class_exercise_2.service.ashokCourseService;

@RestController
public class ashokCourseController {

     @Autowired
     public ashokCourseService CourseService;

     @PostMapping("/api/course")
     public ResponseEntity<ashokCourse> postMethodName(@RequestBody ashokCourse entity) {

          ashokCourse inst = CourseService.SaveEntity(entity);

          return new ResponseEntity<ashokCourse>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/course")
     public ResponseEntity<List<ashokCourse>> getMethodName() {

          List<ashokCourse> show = CourseService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ashokCourse>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ashokCourse>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/course/{courseName}")
     public List<ashokCourse> custom(@PathVariable String courseName) {
          return CourseService.findByCourseName(courseName);

     }
}
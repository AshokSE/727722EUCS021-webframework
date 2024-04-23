package com.example.class_exercise_2.ashokcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.class_exercise_2.ashokmodel.ashokStudent;
import com.example.class_exercise_2.ashokservice.ashokStudentService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ashokStudentController {

     @Autowired
     public ashokStudentService studentService;

     @GetMapping("/api/student")
     public ResponseEntity<List<ashokStudent>> getDetails() {
          List<ashokStudent> list = studentService.getAll();
          if (list.isEmpty()) {
               return new ResponseEntity<List<ashokStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ashokStudent>>(list, HttpStatus.OK);

     }

     @PostMapping("/api/student")
     public ResponseEntity<ashokStudent> postMethodName(@RequestBody ashokStudent student) {

          ashokStudent postData = studentService.post(student);
          return new ResponseEntity<>(postData, HttpStatus.OK);
     }

     @GetMapping("/api/student/sort/{field}")
     public ResponseEntity<List<ashokStudent>> sortedDetails(@PathVariable String field) {
          List<ashokStudent> list = studentService.sortedDetails(field);
          if (list.isEmpty()) {
               return new ResponseEntity<List<ashokStudent>>(list, HttpStatus.NOT_FOUND);
          }
          return new ResponseEntity<List<ashokStudent>>(list, HttpStatus.OK);

     }
}

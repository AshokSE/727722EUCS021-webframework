package com.examly.class_exercise_1.ashokcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.class_exercise_1.ashokmodel.ashokPerson;
import com.examly.class_exercise_1.ashokservice.ashokPersonService;

@RestController
public class ashokPersonController {

     @Autowired
     public ashokPersonService personService;

     @PostMapping("/api/person")
     public ResponseEntity<ashokPerson> postMethodName(@RequestBody ashokPerson entity) {

          ashokPerson inst = personService.SaveEntity(entity);

          return new ResponseEntity<ashokPerson>(inst, HttpStatus.CREATED);

     }

     @GetMapping("/api/person")
     public ResponseEntity<List<ashokPerson>> getMethodName() {

          List<ashokPerson> show = personService.getDetails();
          if (!show.isEmpty()) {
               return new ResponseEntity<List<ashokPerson>>(show, HttpStatus.OK);
          } else {
               return new ResponseEntity<List<ashokPerson>>(show, HttpStatus.NOT_FOUND);
          }
     }

     @GetMapping("api/person/byAge")
     public List<ashokPerson> custom(@RequestParam int byAge) {
          return personService.findByAge(byAge);

     }
}
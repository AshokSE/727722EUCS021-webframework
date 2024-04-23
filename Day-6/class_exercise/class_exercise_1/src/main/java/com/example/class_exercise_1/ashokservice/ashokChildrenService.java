package com.example.class_exercise_1.ashokservice;

import java.util.List;
import org.springframework.data.domain.Sort;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.example.class_exercise_1.ashokmodel.ashokChildren;
import com.example.class_exercise_1.ashokrepository.ashokChildrenRepo;

@Service
public class ashokChildrenService {

     @Autowired
     public ashokChildrenRepo childrenRepo;

     public List<ashokChildren> sort(String field) {
          return childrenRepo.findAll(Sort.by(Sort.Direction.DESC, field));
     }

     public ashokChildren save(ashokChildren children) {
          return childrenRepo.save(children);

     }

     public List<ashokChildren> sortedPage(int offset, int pagesize, String field) {
          Page<ashokChildren> sortedPage = childrenRepo
                    .findAll(PageRequest.of(offset, pagesize, Sort.by(Sort.Direction.ASC, field)));
          return sortedPage.getContent();
     }

     public List<ashokChildren> pagination(int offset, int pagesize) {
          Page<ashokChildren> pages = childrenRepo.findAll(PageRequest.of(offset, pagesize));
          return pages.getContent();

     }

}

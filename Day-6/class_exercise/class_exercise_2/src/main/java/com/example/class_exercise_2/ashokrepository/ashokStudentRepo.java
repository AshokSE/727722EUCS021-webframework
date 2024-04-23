package com.example.class_exercise_2.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.class_exercise_2.ashokmodel.ashokStudent;

@Repository
public interface ashokStudentRepo extends JpaRepository<ashokStudent, Integer> {

}
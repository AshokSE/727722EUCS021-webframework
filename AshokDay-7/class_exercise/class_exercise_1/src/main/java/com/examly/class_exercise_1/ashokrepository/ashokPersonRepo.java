package com.examly.class_exercise_1.ashokrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.class_exercise_1.ashokmodel.ashokPerson;

/**
 * PersonRepo
 */
@Repository
public interface ashokPersonRepo extends JpaRepository<ashokPerson, Integer> {

     List<ashokPerson> findByAge(int byAge);
}
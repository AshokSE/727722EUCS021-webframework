package com.examly.springapp.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.examly.springapp.ashokmodel.ashokStudent;

import java.util.List;

@Repository
public interface ashokStudentRepo extends JpaRepository<ashokStudent, Long> {

    List<ashokStudent> findByMarksGreaterThan(int mark);

    List<ashokStudent> findByMarksLessThan(int mark);

}

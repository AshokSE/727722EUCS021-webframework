package com.example.springapp.ashokrepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.springapp.ashokmodel.ashokStudent;
@Repository
public interface ashokStudentRepository extends JpaRepository<ashokStudent,Integer>{
  
    @Query(value="select s.* from student s inner join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<ashokStudent>getStudentInner();

    @Query(value="select s.* from student s left outer join student_detail st on s.id=st.student_id",nativeQuery = true)
    List<ashokStudent> getStudentsLeftOuter();

    

    
}

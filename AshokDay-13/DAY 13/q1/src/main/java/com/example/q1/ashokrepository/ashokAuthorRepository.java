package com.example.q1.ashokrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.q1.ashokmodel.ashokAuthor;
@Repository
public interface ashokAuthorRepository extends JpaRepository<ashokAuthor, Long> {
}

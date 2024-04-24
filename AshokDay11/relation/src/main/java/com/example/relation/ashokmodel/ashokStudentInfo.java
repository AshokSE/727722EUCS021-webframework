package com.example.relation.ashokmodel;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class ashokStudentInfo {
    @Id
    private int id;
    private String address;
    private String phNo;
}

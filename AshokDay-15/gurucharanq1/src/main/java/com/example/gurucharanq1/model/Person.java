package com.example.gurucharanq1.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Person {
    @Id
    public int  id;
    public String firstName;
    public String lasttName;
}

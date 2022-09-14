package com.example.personapi.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;
@Entity
//@Table specifies the table name
@AllArgsConstructor
//generates no args Constructor
@NoArgsConstructor
//@Table(name = "person")
public class Person {
    @Id
//    default id is of sequence
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
//    @Column specifies the columb mapping
    private String name;
    private String location ;
    private Date birthDate;
}

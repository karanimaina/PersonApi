package com.example.personapi.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
//@Table soecifies the table name

public class Person {
    @Id

    private int id;
//    @Column specifies the columb mapping
    private String name;
    private String location ;
    private Date birthDate;
}

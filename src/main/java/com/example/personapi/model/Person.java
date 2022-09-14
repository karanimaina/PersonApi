package com.example.personapi.model;

import javax.persistence.Entity;
import java.util.Date;
@Entity


public class Person {
    private int id;
    private String name;
    private String location ;
    private Date birthDate;
}

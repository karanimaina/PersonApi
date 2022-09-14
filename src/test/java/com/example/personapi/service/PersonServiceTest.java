package com.example.personapi.service;

import com.example.personapi.model.Person;
import com.example.personapi.repository.PersonRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {
    @Autowired
    PersonRepository personRepository;

    @BeforeEach
    void setUp() {
        Person person = new Person(1,"Felix",""
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAllPersons() {

    }

    @Test
    void getPersonById() {
    }

    @Test
    void delete() {
    }
}
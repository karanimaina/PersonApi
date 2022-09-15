//package com.example.personapi.service;
//
//import com.example.personapi.model.Person;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.annotation.DirtiesContext;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import java.util.List;
//
//import static org.junit.jupiter.api.Assertions.*;
//@RunWith(SpringRunner.class)
//@SpringBootTest
//class PersonServiceTest {
//    @Autowired
//    PersonService personService;
//    @BeforeEach
//    void setUp() {
//        Person person = new Person(1L,"felix","Nairobi",false);
//        personService.saveData(person);
//        Person person2 = new Person(2L,"lex","Nairobi",false);
//        personService.saveData(person2);
//        Person person3 = new Person(3L,"lexus","Nairobi",false);
//        personService.saveData(person3);
//        List<Person>personList = personService.getAllPersons();
//        System.out.println(personList.size());
//
//    }
//
//    @AfterEach
//    void tearDown() {
//        personService.deleteAll();
//    }
//
//    @Test
//    void getAllPersons() {
//
//      List<Person> persons = personService.getAllPersons();
//        assertEquals(3, persons.size());
//    }
//
//    @Test
//    void getPersonById() {
//        long id = 3L;
//      Person person = personService.getPersonById(id);
//        assertEquals(person.getId(),3L);
//    }
//
////    @Test
////    void delete() {
////        personService.deleteAll();
////    }
//
//    @Test
//    @DirtiesContext
//    void deleteById() {
//        long id = 1L;
//        personService.deleteById(id);
//        assertNull(personService.getPersonById(id));
//    }
//
//
//    @Test
//    void saveData() {
//        Person person = new Person(15L,"James","Mombsa",false);
//        personService.saveData(person);
//        assertEquals(15L,personService.getPersonById(15L));
//    }
//}
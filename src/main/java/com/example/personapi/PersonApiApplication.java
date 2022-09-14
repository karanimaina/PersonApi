package com.example.personapi;

import com.example.personapi.model.Person;
import com.example.personapi.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class PersonApiApplication  implements CommandLineRunner {
@Autowired
private PersonRepository personRepository;
    public static void main(String[] args) {
        SpringApplication.run(PersonApiApplication.class, args);
    }

//    @Override
//    public void run(String... args) throws Exception {
//    Person person =  personRepository.findById(1);
//    log.info("person 1  -> {}",person );
//    }
}

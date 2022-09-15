package com.example.personapi;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
//implements CommandLineRunner
public class PersonApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(PersonApiApplication.class, args);
    }

}

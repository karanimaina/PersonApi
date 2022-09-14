package com.example.personapi.service;

import com.example.personapi.model.Person;
import com.example.personapi.repository.PersonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;

    public List<Person>getAllPersons(){
       return personRepository.findAll();
    }
    public Person  getPersonById(int id){
        return personRepository.findById(id).orElse(null);
    }
    public void delete(){
        personRepository.deleteAll();
    }

}

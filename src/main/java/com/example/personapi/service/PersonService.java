package com.example.personapi.service;//package com.example.personapi.service;


import com.example.personapi.model.Person;
import com.example.personapi.repository.PersonRepository;
import com.example.personapi.service.exception.ItemNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {
    private final PersonRepository personRepository;
    public List<Person>getAllPersons(){
       return personRepository.findAllBySoftDeleteFalse();
    }
    public Person  getPersonById(long id){
        Person person =  personRepository.findByIdAndSoftDeleteFalse(id).orElse(null);
        if (person==null){
            throw  new ItemNotFoundException("person does not exist");
        }
        return person;
    }
    public void deleteById(long id){
        Person person = personRepository.findByIdAndSoftDeleteFalse(id).orElse(null);
//      if (person == null){
//          throw new ItemNotFoundException("person does not exist");
//      }else {
//          personRepository.deleteById(id);
//      }
//    }
//    public void deleteAll(){
//        List<Person>persons = personRepository.findAllBySoftDeleteFalse();
//        if (persons.isEmpty()){
//            throw new ItemNotFoundException("oops no data available for deletion");
//        }else {
//            personRepository.deleteAll();
//        }
//
//    }
//    public Person saveData(Person person){
//        Person person1 = personRepository.findByNameAndSoftDeleteFalse(person.getName()).orElse(null);
//        if (person1==null){
//            personRepository.save(person);
//        }else {
//            person1.setName(person.getName());
//            person1.setLocation(person.getLocation());
//            personRepository.save(person1);
//        }
//        return  person1;
//    }
//
//}

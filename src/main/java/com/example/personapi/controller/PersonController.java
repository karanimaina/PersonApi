package com.example.personapi.controller;

import com.example.personapi.model.Gerson;
import com.example.personapi.response.UniversalResponse;
import com.example.personapi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("person")
public class PersonController {
    private final PersonService personService;
    @GetMapping("/all")
    UniversalResponse getAllPersons(){
        List<Gerson>gersons = personService.getAllPersons();
       return UniversalResponse.builder()
                .status(200)
                .message("data retrieved successfully")
                .data(gersons)
                .build();
    }
    @GetMapping("/{id}")
    UniversalResponse getPersonById(@PathVariable ("id") long id){
        Gerson gerson = personService.getPersonById(id);
        return UniversalResponse.builder()
                .status(200)
                .data(gerson)
                .message("success")
                .build();
    }
    @PostMapping("/add")
    UniversalResponse addPersons(Gerson person){
        Gerson gerson = personService.saveData(person);
        return UniversalResponse.builder()
                .status(201)
                .message("person added succesfully")
                .data(gerson)
                .build();
    }
    @DeleteMapping("delete")
    UniversalResponse deletePerson(long id){
     Gerson gerson = personService.deleteById(id);
        return  UniversalResponse.builder()
                .status(200)
                .data(gerson)
                .message("delete success")
                .build();
    }
    @DeleteMapping("/delete/all")
    UniversalResponse deleteAllPerson(){
        return  UniversalResponse.builder()
//                .status(200)
//                .message("success")
//                .data(personService.deleteAll())
//                .build();
//    }
//
//
//}

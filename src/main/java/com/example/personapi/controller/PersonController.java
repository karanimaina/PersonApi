package com.example.personapi.controller;

import com.example.personapi.model.Gerson;
import com.example.personapi.response.UniversalResponse;
import com.example.personapi.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("person")
public class PersonController {
    private final PersonService personService;
    @GetMapping("/all")
    ResponseEntity<UniversalResponse> getAllPersons(){
        List<Gerson>gersons = personService.getAllPersons();
       return ResponseEntity.ok().body(UniversalResponse.builder()
                .status(200)
                .message("data retrieved successfully")
                .data(gersons)
                .build());

    }
    @GetMapping("/{id}")
   ResponseEntity<UniversalResponse> getPersonById(@PathVariable ("id") long id){
        Gerson gerson = personService.getPersonById(id);
        return ResponseEntity.ok().body(UniversalResponse.builder()
                .status(200)
                .data(gerson)
                .message("success")
                .build());
    }
    @PostMapping("/add")
    ResponseEntity<UniversalResponse> addPersons(@RequestBody Gerson person){
        Gerson gerson = personService.saveData(person);
        return ResponseEntity.ok().body(UniversalResponse.builder()
                .status(201)
                .message("person added succesfully")
                .data(gerson)
                .build());
    }
    @DeleteMapping("/delete")
    ResponseEntity<UniversalResponse> deletePerson(@RequestParam long id){
     Gerson gerson = personService.deleteById(id);
        return  ResponseEntity.ok().body(UniversalResponse.builder()
                .status(200)
                .data(gerson)
                .message("delete success")
                .build());
    }
    @DeleteMapping("/delete/all")
   ResponseEntity<UniversalResponse> deleteAllPerson(){
        return ResponseEntity.ok().body(UniversalResponse.builder()
                .status(200)
                .message("success")
                .data(personService.deleteAll())
                .build());

    }


}

package com.example.personapi.service;//package com.example.personapi.service;

import com.example.personapi.exceptions.ItemAlreadyExistsException;
import com.example.personapi.exceptions.ItemNotFoundException;
import com.example.personapi.model.Gerson;
import com.example.personapi.repository.GersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class PersonService {
    @Autowired
    private GersonRepository  gersonRepository;
    public List<Gerson>getAllPersons(){
       return gersonRepository.findAllBySoftDeleteFalse();
    }
    public Gerson  getPersonById(long id){
        Gerson person =  gersonRepository.findByIdAndSoftDeleteFalse(id).orElse(null);
        if (person==null){
            throw  new ItemNotFoundException("person does not exist");
        }
        return person;
    }
    public Gerson saveData(Gerson person){
        Gerson gerson = gersonRepository.findByNameAndSoftDeleteFalse(person.getName());
           if (gerson != null){
          throw  new ItemAlreadyExistsException("item already exists");
       }else {
          person = gersonRepository.save(person);
           }
             return  person;

    }
    public Gerson deleteById(long id){
        Gerson gerson = gersonRepository.findByIdAndSoftDeleteFalse(id).orElse(null);
      if (gerson == null){
          throw new ItemNotFoundException("person does not exist");
      }
      gersonRepository.deleteById(gerson.getId());
//      gerson.setSoftDelete(true);
//      return gersonRepository.save(gerson);
        return gerson;
    }
    public String deleteAll(){
        List<Gerson>persons = gersonRepository.findAllBySoftDeleteFalse();
        if (persons.isEmpty()){
            throw new ItemNotFoundException("oops no data available for deletion");
        }else {
            gersonRepository.deleteAll();
        }
        return "deleted" ;
    }


}

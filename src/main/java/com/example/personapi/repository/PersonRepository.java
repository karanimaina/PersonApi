package com.example.personapi.repository;
//package com.example.personapi.repository;
//
//import com.example.personapi.model.Person;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//
////repository
////transaction
//@Transactional
//@Repository
//public class PersonRepository {
////    @Autowired
////    EntityManager entityManager;
////    public  Person findById(int id){
////        //entity and its primary key
////        return entityManager.find(Person.class,id)
// }
//}
import com.example.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Integer> {
    Person findByName(String name);
   Boolean findByName

}
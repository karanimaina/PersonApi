package com.example.personapi.repository;

import com.example.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

//repository
//transaction
@Transactional
@Repository
public interface PersonRepository extends JpaRepository<Person,Integer> {
}

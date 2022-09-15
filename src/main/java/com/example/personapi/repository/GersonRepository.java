package com.example.personapi.repository;


import com.example.personapi.model.Gerson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public interface GersonRepository extends JpaRepository<Gerson,Long> {
    List<Gerson>findAllBySoftDeleteFalse();
    Optional<Gerson>findByIdAndSoftDeleteFalse(long personId);
    Gerson findByNameAndSoftDeleteFalse(String name);
    Gerson deleteGersonById(long gersonId);

}
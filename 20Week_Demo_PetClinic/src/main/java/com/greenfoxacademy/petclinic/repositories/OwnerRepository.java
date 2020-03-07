package com.greenfoxacademy.petclinic.repositories;

import com.greenfoxacademy.petclinic.models.Owner;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface OwnerRepository extends CrudRepository <Owner, Long> {
    List<Owner> findAll();

}

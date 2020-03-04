package com.greenfoxacademy.petclinic.repositories;

import com.greenfoxacademy.petclinic.models.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}

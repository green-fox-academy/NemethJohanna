package com.greenfoxacademy.petclinic.services;

import com.greenfoxacademy.petclinic.models.Pet;
import com.greenfoxacademy.petclinic.repositories.PetRepository;
import org.springframework.stereotype.Service;

@Service
public class PetService {

    private PetRepository petRepository;

    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }
    public Iterable<Pet> list(){
        return petRepository.findAll();
    }

}

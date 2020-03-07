package com.greenfoxacademy.petclinic;

import com.greenfoxacademy.petclinic.models.Owner;
import com.greenfoxacademy.petclinic.models.Pet;
import com.greenfoxacademy.petclinic.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PetclinicApplication implements CommandLineRunner {

    private OwnerRepository ownerRepository;

    @Autowired
    public PetclinicApplication(OwnerRepository ownerRepository) {
        this.ownerRepository = ownerRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PetclinicApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ownerRepository.save(new Owner("Jozsi", "14. Petofi Street", "Budapest", "+36204587264"
//                , (new Pet("dog", "Marci", "02/2018"))
        ));
        ownerRepository.save(new Owner("Anna", "10. Mango Street", "Szentendre", "+36201235847"
//                , (new Pet("cat", "Cirmi", "08/2016"))
        ));
        ownerRepository.save(new Owner("Petra", "8. Apple Street", "Budakeszi", "+36301234567"
//                , (new Pet("snake", "Kiki", "01/2020"))
        ));
    }
}

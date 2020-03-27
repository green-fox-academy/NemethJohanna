package com.greenfoxacademy.restapi.services;

import com.greenfoxacademy.restapi.models.Doubling;
import org.springframework.stereotype.Service;

@Service
public class Services {

    public Doubling doubling (int received){
        Doubling doubling = new Doubling(received, received * 2);
        return doubling;
    }
}

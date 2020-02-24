package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {
    private ArrayList<Fox> foxList;

    public void add (Fox fox){
        foxList.add(fox);
    }

    public FoxService() {
        this.foxList = new ArrayList<>();
    }
}

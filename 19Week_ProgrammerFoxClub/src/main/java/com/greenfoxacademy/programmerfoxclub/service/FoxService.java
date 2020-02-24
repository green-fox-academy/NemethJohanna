package com.greenfoxacademy.programmerfoxclub.service;

import com.greenfoxacademy.programmerfoxclub.model.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoxService {
    private ArrayList<Fox> foxList;

    public void add (Fox fox){
        foxList.add(fox);
    }

    public FoxService() {
        this.foxList = new ArrayList<>();
    }

    public boolean check (Fox fox){
        return foxList.contains(fox);
    }

    public List<Fox> findAll (){
        return foxList;
    }


}

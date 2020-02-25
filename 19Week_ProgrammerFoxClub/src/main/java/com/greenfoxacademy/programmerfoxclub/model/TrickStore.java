package com.greenfoxacademy.programmerfoxclub.model;

import java.util.ArrayList;
import java.util.List;

public class TrickStore {
    private List<String> trickList;

    public TrickStore(){
        trickList = new ArrayList<>();
        trickList.add("coding");
        trickList.add("reading");
        trickList.add("dancing");
    }

    public List<String> getTrickList() {
        return trickList;
    }

}

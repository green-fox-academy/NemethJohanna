package com.greenfoxacademy.restapi.services;

import com.greenfoxacademy.restapi.models.DoUntil;
import org.springframework.stereotype.Service;

@Service
public class RestService {

    public RestService() {
    }

    public int action(DoUntil until, String action){
        int result = 0;
        if (action.equals("sum")){
            result = until.sum();
        }
        else if (action.equals("factor")){
            result = until.factor();
        }
       return result;
    }

}

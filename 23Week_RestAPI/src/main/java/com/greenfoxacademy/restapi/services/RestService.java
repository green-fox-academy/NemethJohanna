package com.greenfoxacademy.restapi.services;

import com.greenfoxacademy.restapi.models.Arrays;
import com.greenfoxacademy.restapi.models.DoUntil;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

    public int[] arrayHandler(String what, Arrays numbers){
        int[] result = new ArrayList;
        if (what.equals("sum")){
            for (int i = 0; i < numbers.getNumbers().length; i++) {
                resultnumbers.getNumbers()[i];

            }
        } else if (what.equals("multiply")){
            for (int i = 0; i < numbers.getNumbers().length; i++) {
                result *= numbers.getNumbers()[i];
            }
        } else if (what.equals("double")){
            for (int i = 0; i < numbers.getNumbers().length; i++) {
                result = numbers.setNumbers(numbers.getNumbers()[i] * 2);
            }
        }
        return result;
    }

}

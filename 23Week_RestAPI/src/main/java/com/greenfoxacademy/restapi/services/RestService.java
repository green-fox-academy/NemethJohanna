package com.greenfoxacademy.restapi.services;

import com.greenfoxacademy.restapi.models.Arrays;
import com.greenfoxacademy.restapi.models.DoUntil;
import com.greenfoxacademy.restapi.models.Log;
import com.greenfoxacademy.restapi.repositories.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestService {

    private LogRepository logRepository;

    @Autowired
    public RestService(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    public RestService() {
    }

    public int action(DoUntil until, String action) {
        int result = 0;
        if (action.equals("sum")) {
            result = until.sum();
        } else if (action.equals("factor")) {
            result = until.factor();
        }
        return result;
    }

    public int sumOrMultiply(String what, Arrays numbers){
        int result = 0;
        if (what.equals("sum")){
            result = numbers.sum();
        } else if (what.equals("multiply")){
            result = numbers.multiply();
        }
        return result;
    }

    public int[] doubleList(Arrays numbers){
        return numbers.doubleNumbers();
    }

    public void saveLog(Log log){
        logRepository.save(log);
    }

    public List<Log> listLogs(){
        return (List<Log>) logRepository.findAll();
    }

    public int logCount(){
        return (int) logRepository.count();
    }


}

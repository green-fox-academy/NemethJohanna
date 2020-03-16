package com.greenfoxacademy.mysqlexercise;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class MysqlexerciseApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MysqlexerciseApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
            TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }
}

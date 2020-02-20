package com.greenfoxacademy.coloring;

import com.greenfoxacademy.coloring.service.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoringApplication implements CommandLineRunner {

    private MyColor coloring;

    public static void main(String[] args) {
        SpringApplication.run(ColoringApplication.class, args);
    }

    @Autowired
    public ColoringApplication(@Qualifier("blue") MyColor coloring) {
        this.coloring = coloring;
    }

    @Override
    public void run(String... args) throws Exception {
        coloring.printColor();
    }
}

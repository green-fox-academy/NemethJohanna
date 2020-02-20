package com.greenfoxacademy.coloring.service;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("green")
public class GreenColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("GREEN");
    }
}

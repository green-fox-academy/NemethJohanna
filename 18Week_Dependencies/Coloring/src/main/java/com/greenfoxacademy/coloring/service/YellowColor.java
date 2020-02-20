package com.greenfoxacademy.coloring.service;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("yellow")
public class YellowColor implements MyColor {
    @Override
    public void printColor() {
        System.out.println("YELLOW");
    }
}

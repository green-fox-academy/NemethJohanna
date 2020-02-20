package com.greenfoxacademy.coloring.service;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("blue")
public class BlueColor implements MyColor {

    BlueColor blueColor;

    public BlueColor(BlueColor blueColor) {
        this.blueColor = blueColor;
    }

    @Override
    public void printColor() {
        System.out.println("BLUE");    }
}

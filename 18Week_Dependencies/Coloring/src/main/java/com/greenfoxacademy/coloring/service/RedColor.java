package com.greenfoxacademy.coloring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class RedColor implements MyColor {

    private Printer printer;

    public RedColor(Printer printer) {
        this.printer = printer;
    }

    @Override
    public void printColor() {
        printer.log("RED");    }
}

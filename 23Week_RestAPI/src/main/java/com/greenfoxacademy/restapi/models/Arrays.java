package com.greenfoxacademy.restapi.models;

import java.util.ArrayList;
import java.util.List;

public class Arrays {

    private int[] numbers;
    private String what;

    public Arrays() {
    }

    public Arrays(int[] numbers, String what) {
        this.numbers = numbers;
        this.what = what;
    }

    public int sum() {
        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            result += getNumbers()[i];
        }
        return result;
    }

    public int multiply() {
        int result = 1;
        for (int i = 0; i < numbers.length; i++) {
            result *= getNumbers()[i];
        }
        return result;
    }

    public int[] doubleNumbers() {
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            result[i] = numbers[i] * 2;
        }
        return result;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[] numbers) {
        this.numbers = numbers;
    }

    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }
}

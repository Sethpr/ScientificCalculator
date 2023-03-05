package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;
import java.util.function.Supplier;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    Scanner in = new Scanner(System.in);
    Supplier<String> userNum = () -> {return in.nextLine();};

    public Console() {

    }

    public void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public String getStringInput(String prompt) {

        return userNum.get();
    }

    public Integer getIntegerInput(String prompt) {
        return null;
    }

    public Double getDoubleInput(String prompt) {
        return null;
    }
}

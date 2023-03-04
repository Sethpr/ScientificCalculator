package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    private double memory = 0;
    private double result = 0;
    public void memoryPlus(double entry) {
        double memory = entry;
    }
    public void memoryClear(double entry) {
        double memory = 0;
    }

    public double memoryCall() {
        return memory;
    }

    public double getSine(double entry){
        return result = Math.sin(entry);
    }

    public double getCosine(double entry) {
        return result = Math.cos(entry);
    }

    public double getTangent(double entry) {
        return result = Math.tan(entry);
    }





}

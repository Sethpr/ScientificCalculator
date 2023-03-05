package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    private double memory = 0;
    private double result = 0;


    public Scientific() {

    }
//    public void switchDisplayMode() {
//        switch (displayMode) {
//
//        }
//    }
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

    public double getInverseSine(double entry) {
        return result = Math.asin(entry);
    }

    public double getInverseCosine(double entry) {
        return result = Math.acos(entry);
    }

    public double getInverseTangent(double entry) {
        return result = Math.atan(entry);
    }

    public String switchUnitsMode(String mode) {
        return null;
    }
    /**
    figure out wtf is Log vs Natural Log
     */
    public double getLog(double entry) {
        return result = Math.log10(entry);
    }
    /**
     figure out wtf is inverse log vs inverse nat log
     */
    public double getInverseLog(double entry) {
        return result = Math.pow(10, entry);
    }

    public double getNaturalLog(double entry) {
        return result = Math.log(entry);
    }

    public double getInverseNatLog(double entry) {
        return result = Math.exp(entry);
    }

    public double factorial(double entry) {
        double factResult = 1;
        if (entry < 0) {
            for (int i = 0; i <= Math.abs(entry); i++) {
                factResult *= i;
            }
            factResult *= -1;
            return factResult;
        } else {
            for (int i = 0; i <= entry; i++) {
                factResult *= i;
            }
        } return factResult;
    }


}

package com.zipcodewilmington.scientificcalculator;

public class Scientific {
    private double memory = 0;
    private double result = 0;
    private double state;
    private String display;
    private boolean isErr;

    public Scientific() {
        Scientific calc;
        calc = new Scientific();
    }
    public void switchDisplayMode(String mode) {

    }
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
        return result;
    }

    public double getInverseCosine(double entry) {
        return result;
    }

    public double getInverseTangent(double entry) {
        return result;
    }

    public String switchUnitsMode(String mode) {
        return null;
    }

    public double getLog(double entry) {
        return result;
    }

    public double getInverseLog(double entry) {
        return result;
    }

    public double getNaturalLog(double entry) {
        return result;
    }

    public double getInverseNatLog(double entry) {
        return result;
    }

    public double factorial(double entry) {
        return result;
    }


}

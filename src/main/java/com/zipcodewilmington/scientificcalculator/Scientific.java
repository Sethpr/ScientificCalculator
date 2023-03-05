package com.zipcodewilmington.scientificcalculator;

public class Scientific {


    public Scientific() {

    }

    public static double getSine(double entry){
        return Math.sin(entry);
    }

    public static double getCosine(double entry) {
        return Math.cos(entry);
    }

    public static double getTangent(double entry) {
        return Math.tan(entry);
    }

    public static double getInverseSine(double entry) {
        return Math.asin(entry);
    }

    public static double getInverseCosine(double entry) {
        return Math.acos(entry);
    }

    public static double getInverseTangent(double entry) {
        return Math.atan(entry);
    }

    /**
    figure out wtf is Log vs Natural Log
     */
    public static double getLog(double entry) {
        return Math.log10(entry);
    }
    /**
     figure out wtf is inverse log vs inverse nat log
     */
    public static double getInverseLog(double entry) {
        return Math.pow(10, entry);
    }

    public static double getNaturalLog(double entry) {
        return Math.log(entry);
    }

    public static double getInverseNatLog(double entry) {
        return Math.exp(entry);
    }

    public static double factorial(double entry) {
        double factResult = 1;
        if (entry < 0) {
            for (int i = 1; i <= Math.abs(entry); i++) {
                factResult *= i;
            }
            factResult *= -1;
            return factResult;
        } else {
            for (int i = 1; i <= entry; i++) {
                factResult *= i;
            }
        } return factResult;
    }


}

package com.zipcodewilmington.scientificcalculator;

public class Core{
    double state;

    public Core(){
        state = 0;
    }

    public double getState(){
        return state;
    }

    public void setState(double x){
        state = x;
    }

    public void clearDisplay(){
        System.out.println();
    }

    public double add(double x, double y){
        return x + y;
    }

    public double subtract(double x, double y){
        return x - y;
    }

    public double multiply(double x, double y){
        return x * y;
    }

    public double divide(double x, double y){
        return x/y;
    }

    public double square(double x){
        return x*x;
    }

    public double exponent(double x, double y){
        return Math.pow(x, y);
    }

    public double squareRoot(double x){
        return Math.sqrt(x);
    }

    public double inverse(double x){
        return 1/x;
    }

    public double switchSign(double x){
        return -1*x;
    }



}
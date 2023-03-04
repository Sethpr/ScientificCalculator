package com.zipcodewilmington.scientificcalculator;

public class Core{
    double state;

    public Core(){
        state = 0;
    }

    public double getState(){
        return state;
    }

    public void clearDisplay(){
        System.out.println();
    }

    public double square(double x){
        return x*x;
    }

    public double exponenet(double x, double y){
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
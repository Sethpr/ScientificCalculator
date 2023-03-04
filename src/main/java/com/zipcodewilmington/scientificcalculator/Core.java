package com.zipcodewilmington.scientificcalculator;

public class Core{
    private double state; //Number currently being operated on in the calculator
    private String display; //What the user is going to see, frequently a string version of state
    private boolean isErr; //flags if there is an error, does not run calc functions if isErr is true

    public Core(){
        this.state = 0.0;
        this.display = "0.0";
        this.isErr = false;
    }

    public double getState(){
        return this.state;
    }

    public void setState(double x){
        this.state = x;
    }

    public String getDisplay() {
        return this.display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public void clearDisplay(){
        //System.out.println();
        setState(0.0);
        setDisplay("0.0");
    }

    public void err(){
        setDisplay("Err");
        this.isErr = true;
    }

    public void clearErr(){
        setDisplay("" + state);
        this.isErr = false;
    }

    public boolean checkErr(){
        return this.isErr;
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
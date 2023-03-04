package com.zipcodewilmington.scientificcalculator;

public class Core{
    private double state; //Number currently being operated on in the calculator
    private String display; //What the user is going to see, frequently a string version of state
    private boolean isErr; //flags if there is an error, does not run calc functions if isErr is true

    /**
     * Core constructor, sets state and display to 0 and isErr to false.
     */
    public Core(){
        this.state = 0.0;
        this.display = "0.0";
        this.isErr = false;
    }

    /**
     * Gets the state value.
     * @return double state
     */
    public double getState(){
        return this.state;
    }

    /**
     * Primary function to set state and display. !!Please use this one over the setters!!
     * @param x double value that will become the state and display
     */
    public void update(double x){
        setState(x);
        setDisplay("" + x);
    }

    /**
     * Sets the state, please use update though.
     * @param x double value to set state to
     */
    public void setState(double x){
        this.state = x;
    }

    /**
     * Returns what is currently on the display.
     * @return String, display
     */
    public String getDisplay() {
        return this.display;
    }

    /**
     * Sets display value, please use update though.
     * @param display
     */
    public void setDisplay(String display) {
        this.display = display;
    }

    /**
     * Reverts state back to 0.
     */
    public void clearDisplay(){
        //System.out.println();
        update(0.0);
    }

    /**
     * Sets display to Err and sets isErr flag to true.
     * Other functions should not run while err is true
     */
    public void err(){
        setDisplay("Err");
        this.isErr = true;
    }

    /**
     * Resets display to state and sets isErr flag to false.
     */
    public void clearErr(){
        setDisplay("" + state);
        this.isErr = false;
    }

    /**
     * Returns the error status.
     * False means no error, so we will likely negate this value frequently.
     * @return boolean value of error
     */
    public boolean checkErr(){
        return this.isErr;
    }

    //all parameters and returns below this line are double

    /**
     * Adds x and y together and returns them.
     * @param x
     * @param y
     * @return
     */
    public double add(double x, double y){
        return x + y;
    }

    /**
     * Subtracts y from x and returns them.
     * @param x
     * @param y
     * @return
     */
    public double subtract(double x, double y){
        return x - y;
    }

    /**
     * Multiplies x and y and returns them.
     * @param x
     * @param y
     * @return
     */
    public double multiply(double x, double y){
        return x * y;
    }

    /**
     * Divides x by y and returns them.
     * @param x
     * @param y
     * @return
     */
    public double divide(double x, double y){
        return x/y;
    }

    /**
     * Returns the square of x.
     * @param x
     * @return
     */
    public double square(double x){
        return x*x;
    }

    /**
     * Return x raised to the y power.
     * @param x
     * @param y
     * @return
     */
    public double exponent(double x, double y){
        return Math.pow(x, y);
    }

    /**
     * Returns the square root of x.
     * @param x
     * @return
     */
    public double squareRoot(double x){
        return Math.sqrt(x);
    }

    /**
     * Returns the inverse of x.
     * @param x
     * @return
     */
    public double inverse(double x){
        return 1/x;
    }

    /**
     * Flips the sign of x.
     * @param x
     * @return
     */
    public double switchSign(double x){
        return -1*x;
    }



}
package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    private double state; //Number currently being operated on in the calculator
    private String display; //What the user is going to see, frequently a string version of state
    private boolean isErr; //flags if there is an error, does not run calc functions if isErr is true



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
     * Version of update to use if you want to display a non-decimal version of state.
     * Translate it BEFORE handing it to update.
     * @param x decimal value of state
     * @param nonDecimalState non decimal value to be displayed
     */
    public void update(double x, String nonDecimalState){
        setState(x);
        setDisplay(nonDecimalState);
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

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
}

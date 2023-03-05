package com.zipcodewilmington.scientificcalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    private double state = 0.0; //Number currently being operated on in the calculator
    private String display = "0.0"; //What the user is going to see, frequently a string version of state
    private boolean isErr = false; //flags if there is an error, does not run calc functions if isErr is true

    private double memory = 0;


    public void memoryPlus(double entry) {
        double memory = entry;
    }
    public void memoryClear(double entry) {
        double memory = 0;
    }
    public double memoryCall() {
        return memory;
    }
    /**
     * Gets the state value.
     * @return double state
     */
    public double getState(){
        return state;
    }

    /**
     * Primary function to set state and display. !!Please use this one over the setters!!
     * @param x double value that will become the state and display
     */
    public void update(double x){
        if(checkErr()){
            err();
        }
        else {
            setState(x);
            setDisplay("" + x);
        }
    }

    /**
     * Version of update to use if you want to display a non-decimal version of state.
     * Translate it BEFORE handing it to update.
     * @param x decimal value of state
     * @param nonDecimalState non decimal value to be displayed
     */
    public  void update(double x, String nonDecimalState){
        setState(x);
        setDisplay(nonDecimalState);
    }

    /**
     * Sets the state, please use update though.
     * @param x double value to set state to
     */
    public void setState(double x){
        state = x;
    }

    /**
     * Returns what is currently on the display.
     * @return String, display
     */
    public String getDisplay() {
        return display;
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
        return isErr;
    }
    public String switchDisplayMode(String mode, double state) {
        if (mode.equalsIgnoreCase("binary")) {
            if (state >= 1 || state <= 0) {
                return "error";
            }
            StringBuilder binaryMode = new StringBuilder();
            binaryMode.append(".");
            while (state > 0) {
                if (binaryMode.length() >= 32) {
                    return "error";
                }
            }
            double r = state * 2;
            if (r >= 1) {
                binaryMode.append("1");
                state = r -1;
            } else {
                binaryMode.append("0");
                state = r;
            }
            return binaryMode.toString();
        } else if (mode.equalsIgnoreCase("octal")) {
            String octalString = Integer.toOctalString((int) state);
        } else if (mode.equalsIgnoreCase("decimal")) {
            return "" + state;
        } else if (mode.equalsIgnoreCase("hexadecimal")) {
            String hexa = Double.toHexString(state);
            return hexa;
        }
        return mode;
    }
    public String switchUnitsMode(String mode, double state) {
        if (mode.equalsIgnoreCase("degrees")) {
            return String.valueOf(Math.toDegrees(state));
        } else if (mode.equalsIgnoreCase("radians")) {
            return String.valueOf(Math.toDegrees(state));
        }   return "" + state;
    }
    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput() {
        Scanner scanner = new Scanner(System.in);
        println("Please enter a number");
        double userInput = scanner.nextDouble();
        return userInput;
    }


}

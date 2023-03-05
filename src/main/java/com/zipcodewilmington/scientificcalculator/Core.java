package com.zipcodewilmington.scientificcalculator;

public class Core{



    /**
     * Adds x and y together and returns them.
     * @param x
     * @param y
     * @return
     */
    public static double add(double x, double y){
        return x + y;
    }

    /**
     * Subtracts y from x and returns them.
     * @param x
     * @param y
     * @return
     */
    public static double subtract(double x, double y){
        return x - y;
    }

    /**
     * Multiplies x and y and returns them.
     * @param x
     * @param y
     * @return
     */
    public static double multiply(double x, double y){
        return x * y;
    }

    /**
     * Divides x by y and returns them.
     * @param x
     * @param y
     * @return
     */
    public static double divide(double x, double y){
        return x/y;
    }

    /**
     * Returns the square of x.
     * @param x
     * @return
     */
    public static double square(double x){
        return x*x;
    }

    /**
     * Return x raised to the y power.
     * @param x
     * @param y
     * @return
     */
    public static double exponent(double x, double y){
        return Math.pow(x, y);
    }

    /**
     * Returns the square root of x.
     * @param x
     * @return
     */
    public static double squareRoot(double x){
        return Math.sqrt(x);
    }

    /**
     * Returns the inverse of x.
     * @param x
     * @return
     */
    public static double inverse(double x){
        return 1/x;
    }

    /**
     * Flips the sign of x.
     * @param x
     * @return
     */
    public static double switchSign(double x){
        return -1*x;
    }

    public static double mod(double x, double y){
        return x%y;
    }



}
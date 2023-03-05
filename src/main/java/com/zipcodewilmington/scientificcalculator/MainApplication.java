package com.zipcodewilmington.scientificcalculator;

import java.util.Locale;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {


    public static double processIn(Console con, String input, double x){
        switch(input){
            case "multiply":
                return Core.multiply(x,Console.getDoubleInput());
            case "add":
                return Core.add(x, Console.getDoubleInput());
            case "subtract":
                return Core.subtract(x,Console.getDoubleInput());
            case "divide":
                double y = Console.getDoubleInput();
                if(y==0){
                    con.err();
                    return x;
                }
                return Core.divide(x,y);
            case "square":
                return Core.square(x);
            case "square root":
                if(x<0){
                    con.err();
                    return x;
                }
                return Core.squareRoot(x);
            case "exponent":
                return Core.exponent(x,Console.getDoubleInput());
            case "switch":
                return Core.switchSign(x);
            case "inverse":
                return Core.inverse(x);
            case "help":
                return x;
            case "clear":
                con.clearErr();
                return 0.0;
            default:
                System.out.println("Invalid command, please try again");
        }
        return 0;
    }

    public static void main(String[] args) {
        Console con = new Console();
        Console.println("Welcome to our calculator!");
        Console.println(con.getDisplay());
        Console.getStringInput("enter command, type 'help' for commands");

        String s = Console.getStringInput("enter command, type 'help' for commands");
        con.update(processIn(con, s, con.getState()));
        while(true) {
            Console.println(con.getDisplay());
            s = Console.getStringInput("enter command").toLowerCase().trim();
            if(con.checkErr() && !s.equals("clear")){
                Console.println("Error please clear");
            }
            con.update(processIn(con, s, con.getState()));
        }
    }
}

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
            case "switch sign":
                return Core.switchSign(x);
            case "inverse":
                return Core.inverse(x);
            case "mod":
                return Core.mod(x,Console.getDoubleInput());
            case "sine":
                return Scientific.sine(x);
            case "cosine":
                return Scientific.cosine(x);
            case "tangent":
                return Scientific.tangent(x);
            case "log":
                return Scientific.log(x);
            case "natural log":
                return Scientific.naturalLog(x);
            case "inverse sine":
                return Scientific.inverseLog(x);
            case "inverse cosine":
                return Scientific.inverseCosine(x);
            case "inverse log":
                return Scientific.inverseNatLog(x);
            case "inverse natural log":
                return Scientific.inverseSine(x);
            case "inverse tangent":
                return Scientific.inverseTangent(x);
            case "factorial":
                return Scientific.factorial(x);
            case "set memory":
                con.memoryPlus(x);
                return x;
            case "get memory":
                return con.memoryCall();
            case "clear memory":
                con.memoryClear(x);
                return x;
            case "help":
                help();
                return x;
            case "clear":
                con.clearErr();
                return 0.0;
            default:
                System.out.println("Invalid command, please try again");
                return x;
        }
    }

    public static void main(String[] args) {
        Console con = new Console();
        Console.println("Welcome to our calculator! \n type 'help' for commands");
        String s;
        while(true) {
            Console.println(con.getDisplay());
            s = Console.getStringInput("enter command").toLowerCase().trim();
            if(con.checkErr() && !s.equals("clear")){
                Console.println("Error please clear");
                continue;
            }
            con.update(processIn(con, s, con.getState()));
        }
    }

    public static void help(){
        System.out.println("list of commands:");
        System.out.println("add, subtract, multiply, divide");
        System.out.println("square, square root, exponent, switch sign");
        System.out.println("inverse, mod, help, clear");
        System.out.println("sine, cosine, tangent, ");
        System.out.println("inverseSine, inverseCosine, inverseTangent");
        System.out.println("log, inverseLog, naturalLog, inverseNatLog");
        System.out.println("factorial");

    }
}

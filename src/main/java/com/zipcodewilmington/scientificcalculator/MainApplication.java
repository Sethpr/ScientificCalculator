package com.zipcodewilmington.scientificcalculator;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Locale;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static double processIn(Console con, String input, double x){
        switch(input){
            case "times":
            case "x":
            case "*":
            case "multiply":
                return Core.multiply(x,Console.getDoubleInput());
            case "plus":
            case "+":
            case "add":
                return Core.add(x, Console.getDoubleInput());
            case "minus":
            case "-":
            case "subtract":
                return Core.subtract(x,Console.getDoubleInput());
            case "/":
            case "divide":
                double y = Console.getDoubleInput();
                if(y==0){
                    con.err();
                    return x;
                }
                return Core.divide(x,y);
            case "square":
                return Core.square(x);
            case "sqrt":
            case "^2":
            case "^ 2":
            case "square root":
                if(x<0){
                    con.err();
                    return x;
                }
                return Core.squareRoot(x);
            case "^":
            case "power":
            case "exponent":
                return Core.exponent(x,Console.getDoubleInput());
            case "negate":
            case "switch sign":
                return Core.switchSign(x);
            case "inverse":
                return Core.inverse(x);
            case "modulo":
            case "mod":
                return Core.mod(x,Console.getDoubleInput());
            case "sin":
            case "sine":
                return Scientific.sine(x);
            case "cos":
            case "cosine":
                return Scientific.cosine(x);
            case "tan":
            case "tangent":
                return Scientific.tangent(x);
            case "log":
                return Scientific.log(x);
            case "ln":
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
            case "fact":
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
            case "switch display":
                System.out.println("0: binary\n1: octal\n2: decimal\n3: hex");
                con.switchDisplayMode(Console.getIntegerInput());
                return x;
            case "switch units":
                System.out.println("0: degrees\n1: radians");
                con.switchUnitsMode(Console.getIntegerInput());
                return x;
            case "boom":
            case "hehe":
                Desktop desktop = java.awt.Desktop.getDesktop();
                try {
                    //specify the protocol along with the URL
                    URI oURL = new URI(
                            "https://www.youtube.com/watch?v=dQw4w9WgXcQ"); //lol, lmao
                    desktop.browse(oURL);
                } catch (URISyntaxException | IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                return x;
            case "h":
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
        System.out.println("factorial, boom, hehe");
        System.out.println("switch display, switch units");
    }
}

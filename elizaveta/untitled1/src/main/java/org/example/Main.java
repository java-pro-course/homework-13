package org.example;
import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            try{
                Double a = in.nextDouble();
                Double b = in.nextDouble();
                System.out.println(a/b);
            }catch(ArithmeticException e){
                System.out.println("you can't divide by zero");
                System.err.println(e);
            }
        }
    }
}
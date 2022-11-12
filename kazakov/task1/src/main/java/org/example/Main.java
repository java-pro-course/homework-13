package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        while(true){
            try{
                int a = in.nextInt();
                int b = in.nextInt();
                System.out.println(a/b);
            }catch(ArithmeticException e){
                System.out.println("Sorry, a number can`t be divided by zero!");
                System.err.println(e);
            }
        }
    }
}
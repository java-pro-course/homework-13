package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void Div(){
        int a;
        int b;
        try {
            a = in.nextInt();
            b = in.nextInt();
            System.out.println(a/b);
    } catch (ArithmeticException divByZero) {
        System.err.println("You can't divide by zero!");
        Div();
        }
    }
    public static void main(String[] args){
        Div();
    }
}

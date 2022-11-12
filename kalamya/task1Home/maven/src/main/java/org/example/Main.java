package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            try {
                int a = in.nextInt();
                int b = in.nextInt();
                int c = a / b;
                System.out.println(c);
            } catch (ArithmeticException dicByZero) {
                System.err.println("You try to divide by zero!");
            }
        }
    }
    public static Scanner in = new Scanner(System.in);
}
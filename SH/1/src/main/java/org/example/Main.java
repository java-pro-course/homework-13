package org.example;

import java.util.Scanner;

public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int c = 0;
        try {
            int a = in.nextInt();
            int b = in.nextInt();
            c = a / b;
        } catch (ArithmeticException divByZero) {
            System.err.println("На ноль делить нельзя!!!");
        }
        System.out.println(c);
    }
}
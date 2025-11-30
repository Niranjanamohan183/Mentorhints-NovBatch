package com.week1.javaBasics;

public class ArithmeticOperators {
    public static void main(String[] args) {

        int a = 20;
        int b = 6;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Arithmetic operations
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;        // Integer division
        int remainder = a % b;       // Modulus (remainder)

        // Print results
        System.out.println("Addition (a + b) = " + addition);
        System.out.println("Subtraction (a - b) = " + subtraction);
        System.out.println("Multiplication (a * b) = " + multiplication);
        System.out.println("Division (a / b) = " + division);
        System.out.println("Remainder (a % b) = " + remainder);
    }
}


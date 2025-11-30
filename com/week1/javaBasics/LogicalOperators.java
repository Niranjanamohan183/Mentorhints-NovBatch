package com.week1.javaBasics;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean x = true;
        boolean y = false;

        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // Logical AND (&&)
        System.out.println("x && y = " + (x && y));  // true AND false => false

        // Logical OR (||)
        System.out.println("x || y = " + (x || y));  // true OR false => true

        // Logical NOT (!)
        System.out.println("!x = " + (!x));          // NOT true => false
        System.out.println("!y = " + (!y));          // NOT false => true

        // Logical AND with expressions
        int a = 10, b = 5;
        System.out.println("(a > b) && (b > 0) = " + ((a > b) && (b > 0))); // true && true => true

        // Logical OR with expressions
        System.out.println("(a < b) || (b > 0) = " + ((a < b) || (b > 0))); // false || true => true
    }
}

package com.polymorphism.overloading;

public class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add one int and one double
    public static double add(int a, double b) {
        return a + b;
    }

    // Overloaded method to add one double and one int
    public double add(double a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 ints: " + calc.add(5, 10));               // 15
        System.out.println("Add 3 ints: " + calc.add(1, 2, 3));             // 6
        System.out.println("Add 2 doubles: " + calc.add(2.5, 3.5));         // 6.0
        System.out.println("Add int + double: " + calc.add(4, 2.5));        // 6.5
        System.out.println("Add double + int: " + calc.add(2.5, 4));        // 6.5
    }
}


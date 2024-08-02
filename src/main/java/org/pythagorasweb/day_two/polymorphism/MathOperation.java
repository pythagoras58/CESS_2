package org.pythagorasweb.day_two.polymorphism;
/*
*   This is a Compile time polymorphism
* */
public class MathOperation {
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

    // multiple
    public int multiply(int a, int b){
        return a*b;
    }
    public int multiply( int b){
        return b;
    }
}

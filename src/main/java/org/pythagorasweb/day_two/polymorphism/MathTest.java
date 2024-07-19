package org.pythagorasweb.day_two.polymorphism;

public class MathTest {
    public static void main(String[] args) {
        MathOperation math = new MathOperation();

        System.out.println("Sum of two integers: " + math.add(2, 3));
        System.out.println("Sum of three integers: " + math.add(1, 2, 3));
        System.out.println("Sum of two doubles: " + math.add(2.5, 3.5));
    }
}

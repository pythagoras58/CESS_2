package org.pythagorasweb.day_five.exceptions;

import java.util.Scanner;

public class BasicExceptions {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your dividing value: ");
            int divider = scanner.nextInt();

            int results = 10 / (divider);

            System.out.println(results);
        }catch (ArithmeticException e){
            System.out.println("You cannot divide by zero (0)");
        }

        // Handle the ArithmeticException and getMessage on the exception as well


    }
}

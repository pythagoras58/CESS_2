package org.pythagorasweb.inheritance.test;

public class Vehicle {
    int numberOfWheels;

    Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    void displayInfo() {
        System.out.println("Number of wheels: " + numberOfWheels);
    }
}

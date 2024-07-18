package org.pythagorasweb.inheritance.test;

public class Car extends Vehicle{

    int numberOfDoors;

    Car(int numberOfWheels, int numberOfDoors) {
        super(numberOfWheels);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}

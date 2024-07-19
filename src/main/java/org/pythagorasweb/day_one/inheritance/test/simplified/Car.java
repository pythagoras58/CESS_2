package org.pythagorasweb.day_one.inheritance.test.simplified;

public class Car extends Vehicle{

    private final int numberOfDoor = 4;

    @Override
    boolean displayInfo() {
        super.displayInfo();
        System.out.println("This car has -->" + numberOfDoor + " door");
        return false;
    }
}

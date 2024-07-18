package org.pythagorasweb.inheritance.test;

public class Bike extends Vehicle{

    boolean hasCarrier;

    Bike(int numberOfWheels, boolean hasCarrier) {
        super(numberOfWheels);
        this.hasCarrier = hasCarrier;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Has carrier: " + hasCarrier);
    }
}

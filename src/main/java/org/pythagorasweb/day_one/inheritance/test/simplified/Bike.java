package org.pythagorasweb.day_one.inheritance.test.simplified;

public class Bike extends Vehicle{

    private final boolean hasCarrier = false;

    @Override
    boolean displayInfo() {
        //super.displayInfo();
        System.out.println("This Bike hasCarrier? " + hasCarrier);
        return Boolean.parseBoolean(null);
    }
}

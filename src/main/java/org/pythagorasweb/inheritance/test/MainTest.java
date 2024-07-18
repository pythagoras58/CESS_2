package org.pythagorasweb.inheritance.test;

public class MainTest {
    public static void main(String[] args) {
        Car car = new Car(4, 4);
        Bike bike = new Bike(2, true);

        System.out.println("Car information:");
        car.displayInfo();

        System.out.println("\nBike information:");
        bike.displayInfo();
    }
}

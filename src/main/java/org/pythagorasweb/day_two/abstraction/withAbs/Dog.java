package org.pythagorasweb.day_two.abstraction.withAbs;

public class Dog extends Animal{

    // Providing implementation of the abstract method
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

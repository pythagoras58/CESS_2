package org.pythagorasweb.day_two.abstraction.withAbs;

abstract class Animal {
    // Abstract method (does not have a body)
    abstract void makeSound();

    // Concrete method
    void eat() {
        System.out.println("This animal eats food");
    }
}

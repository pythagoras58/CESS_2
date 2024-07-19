package org.pythagorasweb.day_one.inheritance.example;

public class MainTest {
    public static void main(String[] args) {
        Dog _dog = new Dog();
//        dog.eat(); // Inherited method from Animal class
//        dog.bark(); // method of the dog class

        _dog.bark();
        _dog.eat();
        _dog.name();
    }
}

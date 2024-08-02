package org.pythagorasweb.day_three;

import java.util.LinkedList;

public class LinkedList_sample {
    public static void main(String[] args) {
        // Creating a LinkedList of Strings
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Outputs: Apple

        // Removing elements
        fruits.remove(1); // Removes "Banana"

        // Size of the LinkedList
        System.out.println("Number of fruits: " + fruits.size()); // Outputs: 2
    }
}

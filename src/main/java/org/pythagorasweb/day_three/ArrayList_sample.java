package org.pythagorasweb.day_three;

import java.util.ArrayList;

public class ArrayList_sample {
    public static void main(String[] args) {
        // Creating an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();
        ArrayList<?> _names = new ArrayList<>();
        ArrayList<Integer> _id = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        _id.add(2332);

        // Accessing elements
        System.out.println("First fruit: " + fruits.get(0)); // Outputs: Apple

        // Removing elements
        fruits.remove(1); // Removes "Banana"

        // Size of the ArrayList
        System.out.println("Number of fruits: " + fruits.size()); // Outputs: 2

        // Iterating over elements
        for(String fruit : fruits){
            System.out.println(fruit);
        }
    }
}

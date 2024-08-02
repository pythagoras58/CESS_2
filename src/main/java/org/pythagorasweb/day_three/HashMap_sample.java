package org.pythagorasweb.day_three;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMap_sample {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> map = new HashMap<>();

        // Adding elements
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Accessing elements
        System.out.println("Value for Apple: " + map.get("Apple")); // Outputs: 1

        // Removing elements
        map.remove("Banana");

        // Size of the HashMap
        System.out.println("Size of map: " + map.size()); // Outputs: 2

        // Iterating over elements
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        ArrayList<Integer> i = new ArrayList<>();
        for (int a : i){

        }
    }
}

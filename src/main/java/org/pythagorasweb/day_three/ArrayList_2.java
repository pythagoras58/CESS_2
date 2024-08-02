package org.pythagorasweb.day_three;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);



        // Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted numbers: " + numbers); // Outputs: [1, 2, 3]

        // Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed numbers: " + numbers); // Outputs: [3, 2, 1]
    }
}

package org.pythagorasweb.day_four.on_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestUtility {
    public static void main(String[] args) {
        //Utility utility = new Utility();
        Integer[] intArr1 = {1,2,3,4,5};
        Integer[] intArr2 = {1,2,3,4,5};
        Integer[] intArr3= {1,2,3,4,5};
        Integer[] intArr4 = {1,2,3,4,5};
        
        Utility.printArray(intArr1);
        Utility.printArray(intArr2);
        Utility.printArray(intArr3);
        Utility.printArray(intArr4);

        String name = "Yahya";
        Utility.extracted(name);

       
        // input array into arraylist
       // ArrayList<Integer> _arrList = new ArrayList<>(List.of(intArr4));

    }
}

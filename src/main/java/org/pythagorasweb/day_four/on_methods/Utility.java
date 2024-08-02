package org.pythagorasweb.day_four.on_methods;

public class Utility {
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.println(element + "\n");
        }
    }public static void extracted(String _name) {

        System.out.println(_name);
    }
}

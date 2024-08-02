package org.pythagorasweb.day_four.on_class;

import java.util.ArrayList;

public class TestBox {
    public static void main(String[] args) {


        // instantiation
        Box<Integer> int_box = new Box<>();
        // set and get values
        int_box.setItem(22312);
        int_box.getItem();


        // instantiation
        Box<String> string_box = new Box<>();
        // set and get values
        Box<Double> double_BOX = new Box<>();

        // arrayList
        Box<ArrayList<String>> _arr = new Box<>();

        Box<Person> _person = new Box<>();
    }
}

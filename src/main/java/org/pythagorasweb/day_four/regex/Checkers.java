package org.pythagorasweb.day_four.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Checkers {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("Java training", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("come for TRAINING");

        if(matcher.find()){
            System.out.println("Matcher Found");
        }else {
            System.out.println("Matcher Found");
        }
    }
}

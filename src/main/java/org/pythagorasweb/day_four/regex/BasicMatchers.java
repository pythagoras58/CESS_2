package org.pythagorasweb.day_four.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BasicMatchers {
    public static void main(String[] args) {
        String regex = "\\d+"; // Regex to match one or more digits
        String input = "12345";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("The input matches the regex.");
        } else {
            System.out.println("The input does not match the regex.");
        }
    }
}

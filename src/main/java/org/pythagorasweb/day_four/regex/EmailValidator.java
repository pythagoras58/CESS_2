package org.pythagorasweb.day_four.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
    public static void main(String[] args) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String email_input = "sdasdqw23213@gmail.com";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email_input);

        if(matcher.matches()){
            System.out.println("Valid Email");
        }else{
            System.out.println("Invalid Email");
        }
    }
}

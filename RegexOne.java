package com.bridgelabz.regexone;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegexOne {
    static Pattern pattern = Pattern.compile("^([0-9]{6}+$)");
    public static void main(String[] args) {
        String zipcode = "A400088";
        Matcher matcher = pattern.matcher(zipcode);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}



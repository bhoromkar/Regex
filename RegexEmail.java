package com.bridgelabz.regexone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexEmail {
    static Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(?:[A-Za-z0-9-])+$");
    public static void main(String[] args) {
        String zipcode = "abc.xyz@bridegelab";
        Matcher matcher = pattern.matcher(zipcode);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}



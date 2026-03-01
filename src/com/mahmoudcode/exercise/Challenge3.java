package com.mahmoudcode.exercise;

import java.util.Arrays;

public class Challenge3 {

    /*
        Write a method that reverses any String and print to console
        Input should be a string
        Output should be reversed input
    */
    public static String reverseString(String str) {

        if(str == null || str.isEmpty() || str.isBlank()) return str;
        // invoke your function here
        System.out.println(str);
        StringBuilder reversed = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reversed.append(str.charAt(i));
        }
        System.out.println(reversed);

        return reversed.toString();
    }

    /*
    Given the following String input
    String input = "   amig os cod e  "
    Write a method that transforms input into: Amigoscode
    */
    public static String trimSpaces(String str){

        if(str == null || str.isBlank() || str.isEmpty()) return str;
        System.out.println("Before removing space: " + str);
        System.out.println("After removing space: " + str.replaceAll(" ", ""));

        return str;
    }

    /*
    Write a method that finds the longest string in any given array.
    i.e. [] -> ""
    i.e. ["hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
    i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo
    */
    public static String longestString(String[] array){
        if(array.length == 0) return "";

        int longest = 0;
        StringBuilder longestString = new StringBuilder();

        for (String currentString : array) {

            if (currentString.length() > longest) {
                longestString = new StringBuilder(currentString);
                longest = currentString.length();
            }

            else if(currentString.length() >= longest) {
                longestString.append(", ").append(currentString);
            }

        }

        System.out.println("Longest string in " + Arrays.toString(array) + " is " + longestString);
        return longestString.toString();
    }
}


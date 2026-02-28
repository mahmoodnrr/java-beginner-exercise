package com.mahmoudcode.exercise;

public class ConditionalsExercise {

    public static void printExercise(){
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
        exercise6();
        exercise7();
        exercise8();
        exercise9();
    }

    private static void exercise1(){

        System.out.println("Create an if statement to compare the two integer variables");
        int a = 1;
        int b = 12;

        if(a == b) {
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println("The numbers are not equal");
        }
    }

    private static void exercise2(){

        System.out.println("\nCreate an if statement to compare the two string variables");
        String firstString = "Hello";
        String secondString = "Hello";

        if(firstString == secondString) System.out.println("Both strings are equal");
    }

    private static void exercise3(){

        System.out.println("\nCreate an if statement to compare the two variables using 'new' keyword");
        String firstString = new String("Hello");
        String secondString =  new String("Hello");

        if(firstString == secondString) System.out.println("Both strings are equal");
    }

    private static void exercise4(){

        System.out.println("\nCreate an `if` statement which compares whether one value is greater than the other");
        int firstInteger = 10;
        int secondInteger = 20;

        if(firstInteger == secondInteger) {
            System.out.println("Both integers are equal");
        }
        else {
            System.out.println("Both integers are not equal");
        }
    }

    private static void exercise5(){

        System.out.println("\nCreate an `if` statement which compares whether the first value is greater than the second AND less than the third");
        int firstInteger = 10;
        int secondInteger = 2;
        int thirdInteger = 30;

        if((firstInteger > secondInteger) && firstInteger < thirdInteger) {
            System.out.println(firstInteger + " is greater than " + secondInteger + " AND less than " + thirdInteger);
        }
        else {
            System.out.println(firstInteger + " is not greater than " + secondInteger + " AND less than " + thirdInteger);
        }
    }

    private static void exercise6(){

        System.out.println("\nCreate an `if` statement which compares whether the first value is greater than the second OR less than the third");
        int firstInteger = 10;
        int secondInteger = 20;
        int thirdInteger = 30;

        if((firstInteger > secondInteger) || firstInteger < thirdInteger) {
            System.out.println(firstInteger + " is greater than " + secondInteger + " OR is less than " + thirdInteger);
        }
        else {
            System.out.println(firstInteger + " is not greater than " + secondInteger + " OR is less than " + thirdInteger);
        }
    }

    private static void exercise7(){

        System.out.println("\nCreate an `if` statement which grabs the first letter of your word and compares it against a Character value");
        String str = "Hello";

        char specifiedChar = 'H';

        if(str.charAt(0) == specifiedChar) {
            System.out.println("The first letter of the string matches the character");
        }
        else {
            System.out.println("The first letter of the string does not match character");
        }
    }

    private static void exercise8(){

        System.out.println("\nCreate an `if` statement which grabs the first letter of your word and compares it against a Character value");
        String str = "hello";

        char specifiedChar = 'o';
        char specifiedCharLowercase = Character.toLowerCase(specifiedChar);

        for(int i = 0; i < str.length(); i++){
            char stringToLowercase = Character.toLowerCase(str.charAt(i));
            if(str.charAt(i) == specifiedCharLowercase) {
                System.out.println("The string " + str + " contains the character " + specifiedCharLowercase);
                break;
            }
        }



    }

    private static void exercise9() {

        System.out.println("\nCreate a for loop which goes from 0 to 20");

        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Even number " + i);
            }
        }
    }

}

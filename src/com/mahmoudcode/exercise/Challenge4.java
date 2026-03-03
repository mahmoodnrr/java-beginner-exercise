package com.mahmoudcode.exercise;

public class Challenge4 {

    public static void sumOfTwoNumbers(int firstNumber, int secondNumber){
        int sum = firstNumber + secondNumber;

        System.out.println("sum of " + firstNumber + " and " + secondNumber + " is " + sum);
    }

    public static int getNegateNumber(int number){
        return number * -1;
    }

    public static boolean isSameNumber(int firstNumber, int secondNumber){

        return firstNumber == secondNumber;
    }

    public static void compareNumbers(int firstNumber, int secondNumber){

        System.out.println("Comparing " + firstNumber + " and " + secondNumber);
        if(firstNumber > secondNumber){
            System.out.println(firstNumber + " is larger");
        }
        else if(secondNumber > firstNumber){
            System.out.println(secondNumber + " is larger");
        }
        else{
            System.out.println("The numbers are equal");
        }
    }

    public static String getFirstLetter(String str){

        if(str == null || str.isBlank()) return "";

        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static int getNumberOfItems(String[] str){
        return str.length;
    }

    public static int getNumberOfWords(String str){

        if(str == null || str.isEmpty()) return 0;

        return str.split("\\s+").length;
    }

}

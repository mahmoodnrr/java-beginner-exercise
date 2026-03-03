package com.mahmoudcode.exercise;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ScannerExercise {

    public static void exercise1(){

        System.out.println("Hi, type something.");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String upperCaseString = input.toUpperCase();

        System.out.println("User input to upper case : " + upperCaseString);

        scanner.close();
    }

    public static void exercise2(String[] numbers){

        if(numbers.length == 0) {
            System.out.println("Please add some numbers as program arguments.");
            return;
        }
            for(String num : numbers){
                try{
                    if(Integer.parseInt(num) % 2 == 0){
                        System.out.println(num + " is even number");
                    }
                    else{
                        System.out.println(num + " is odd number");
                    }
                }
                catch(NumberFormatException e){
                    System.out.println(num + " is not a valid number");
                }
            }
    }

    public static void exercise3(){

        System.out.println("Type any number to check if it is a prime number or not");
        Scanner scanner = new Scanner(System.in);

        try{
           int number = scanner.nextInt();

           if(number == 2){
               System.out.println(number + " is a prime number");
           }
           else if(number % 2 != 0){
               System.out.println(number + " is a prime number");
           }
           else{
               System.out.println(number + " is not a prime number");
           }

        }
        catch(InputMismatchException e){
            System.out.println("Only number as inputs are valid");
        }
    }

    public static void exercise4(){
        String[] jokeArray = {
                "\nWhat do you call a cow hit by a tornado? A milkshake",
                "\nWhat do you call a bear with no teeth? A gummy bear",
                "\nWhat did the egg say to the boiling water? I dont think I can get hard, I just got laid this morning!"
        };

        Scanner scan = new Scanner(System.in);
        boolean stop = true;

        while(stop){
            System.out.println("\nWant to hear a joke? Yes/No");

            String input = scan.nextLine();
            Random random = new Random();
            int randomNumber = random.nextInt(jokeArray.length);

            if(input.equalsIgnoreCase("yes")){
                System.out.println(jokeArray[randomNumber]);
            }
            else if(input.equalsIgnoreCase("no")){
               stop = false;
            }
            else {
                System.out.println("Type 'yes' or 'no'");
            }
        }
    }
}

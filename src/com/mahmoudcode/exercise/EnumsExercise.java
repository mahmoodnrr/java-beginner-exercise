package com.mahmoudcode.exercise;

import com.mahmoudcode.exercise.enums.TShirtSize;

public class EnumsExercise {

    public static void printTShirtSizes(){

        System.out.println("Printing shirt size...");
        for(TShirtSize size : TShirtSize.values()){
            String shirtSizes = size.name();
            System.out.println("T Shirt Size : " + shirtSizes);
        }

    }

    public static void printTShirtSizesInLowerCase(){

        System.out.println("Printing shirt sizes...");
        for(TShirtSize size : TShirtSize.values()){
            String sizeInLowercase = size.name().toLowerCase();
            System.out.println("T Shirt Size in lower case : " + sizeInLowercase);
        }

    }
}
package com.mahmoudcode.exercise;

public class HandleExceptionExercise {


//      write a program that converts program arguments to an integer
//      if value cannot be converted to int store them somewhere
//      calculate sum for numbers that can be converted to an integer
//      finally print the numbers that cannot be converted to an int
//      example: java com.amigoscode.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
//      output: Sum: 6 and a, b, foo are not numbers.
    public static void exercise1(String[] str){

        if(str.length == 0) {
            System.out.println("Please provide some arguments as inputs");
            return;
        }

        StringBuilder temp = new StringBuilder();
        int total = 0;

        for(int i = 0; i < str.length; i++) {
            try {
                int num = Integer.parseInt(str[i]);
                total += num;

            } catch (NumberFormatException e) {
                System.out.println(str[i] + " is not a number");
                if(!temp.isEmpty()) {
                    temp.append(", ");
                }
                temp.append(str[i]);
            }
        }

        String verb = temp.length() > 1 ? " are not numbers" : " is not a number";
        System.out.println("Sum is " + total + " and " + temp + verb);
    }

    public static void exercise2() {
        try{
            int result = 10 / 0;
        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by 0");
        }
    }
}
